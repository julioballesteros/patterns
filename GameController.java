import java.util.Random;
import java.util.Scanner;

public class GameController {
	
	public GameController() {
		
	}
	
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		//El jugador elige su personaje
		Player player = choosePlayer(sc);
		
		Random rand = new Random();
		Enemy enemy = null;
		int points = 0;
		int randomInt = 0;
		AttackCalculator attackCalculator = AttackCalculator.getInstance();
		Action action = null;
		
		//Mientras el jugador tenga vida
		while(player.getHealth() > 0) {
			//Se elige al enemigo
			enemy = chooseEnemy();
			
			//Comienza el combate, se elige al azar quien atacara primero
			randomInt = rand.nextInt(2);
			if(randomInt == 0) {
				System.out.println("¡Comienza atacando el enemigo!");
				//Ataque de enemigo
				action = enemy.nextAction();
				//Evaluacion de daños
				attackCalculator.calculateAttackResult(enemy, player, action);
			}
			else {
				System.out.println("¡Comienzas atacando!\n");
			}
			
			//mientras ambos jugadores tengan vida
			while(player.isAlive() && enemy.isAlive()) {
				//El jugador elige la accion que quiere realizar ese turno
				action = player.nextAction();
				//Se evalua los daños de la accion en el oponente
				attackCalculator.calculateAttackResult(player, enemy, action);
				//Si el enemigo ha muerto pasa al siguiente combate
				if(!enemy.isAlive())
					break;
				//El enemigo elige la accion
				System.out.println("¡Va a atacar el enemigo!");
				action = enemy.nextAction();
				//Se evalua los daños de la accion
				attackCalculator.calculateAttackResult(enemy, player, action);
			}
			//Se suman los puntos del combate
			points += 100;
		}
		System.out.println("¡Has muerto! Puntos acumulados: " + points);
		sc.close();
		
	}
	
	
	private Player choosePlayer(Scanner sc) {
		
		Player player = null;
		boolean chosen = false;
		int playerChoice;
		String nextIntString;
		while(!chosen) {
			System.out.println("Elige el personaje con el que deseas jugar: \n1 - Guerrero \n2 - Mago \n3 - Druida");
			nextIntString = sc.nextLine();
			playerChoice = Integer.parseInt(nextIntString);
			switch(playerChoice) {
			case 1:
				System.out.println("¡Has elegido jugar como un guerrero!\n");
				player = new Warrior(sc);
				chosen = true;
				break;
			case 2:
				System.out.println("¡Has elegido jugar como un mago!\n");
				player = new Mage(sc);
				chosen = true;
				break;
			case 3:
				System.out.println("¡Has elegido jugar como un druida!\n");
				player = new Druid(sc);
				chosen = true;
				break;	
			default:
				System.out.println("¡Numero introducido incorrecto! Introduce un numero del 1 al 3\n");
			}
		}
		
		return player;
	}
	
	
	private Enemy chooseEnemy() {
		
		Enemy enemy = null;
		Random rand = new Random();
		int randomInt = 0;
		EnemyFactory enemyFactory = null;
		//Se elige el mundo donde se jugará aleatoriamente
		randomInt = rand.nextInt(3) + 1;
		switch(randomInt) {
		case 1:
			enemyFactory = new AzerothEnemyFactory();
			System.out.println("¡El  proximo combate sera en Azeroth!");
			break;
		case 2:
			enemyFactory = new OutlandEnemyFactory();
			System.out.println("¡El proximo combate sera en Outland!");
			break;
		case 3:
			enemyFactory = new FirelandsEnemyFactory();
			System.out.println("¡El proximo combate sera en Firelands!");
			}
		
		//Se elige al oponente aleatoriamente
		randomInt = rand.nextInt(2);
		switch(randomInt) {
		case 0:
			enemy = enemyFactory.createDemon();
			System.out.println("¡El proximo enemigo es un demonio!");
			break;
		case 1:
			enemy = enemyFactory.createUndead();
			System.out.println("¡El proximo enemigo es un no-muerto!");
			break;
		case 2:
			enemy = enemyFactory.createElemental();
			System.out.println("¡El proximo enemigo es un elemental!");
			}
		return enemy;
	}
	
}
