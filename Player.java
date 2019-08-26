import java.util.Scanner;

public abstract class Player extends Character{
	
	private Scanner sc;
	
	public Player(Scanner sc) {
		this.sc = sc;
	}
	
	public void listActions() {
		System.out.println("1 - " + actionOne.getDescription());
		System.out.println("2 - " + actionTwo.getDescription());
		System.out.println("3 - " + actionThree.getDescription());
	}
	
	public Action getNextAction() {
		Action action = null;
		boolean chosen = false;
		int playerChoice = 0;
		String nextIntString;
		
		System.out.println("Elige la acción que quieres realizar");
		listActions();
		chosen = false;
		while(!chosen) {
			nextIntString = sc.nextLine();
			playerChoice = Integer.parseInt(nextIntString);
			switch(playerChoice) {
			case 1:
				System.out.println("¡Has usado " + actionOne.getDescription() + "!");
				action = doActionOne();
				chosen = true;
				break;
			case 2:
				System.out.println("¡Has usado " + actionTwo.getDescription() + "!");
				action = doActionTwo();
				chosen = true;
				break;
			case 3:
				System.out.println("¡Has usado " + actionThree.getDescription() + "!");
				action = doActionThree();
				chosen = true;
				break;	
			default:
				System.out.println("¡Numero introducido incorrecto! Introduce un número del 1 al 3");
			}
		}
		return action;
	}

}
