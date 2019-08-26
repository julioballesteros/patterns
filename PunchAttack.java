import java.util.Random;

public class PunchAttack extends Action{

	public PunchAttack() {
		description = "Puñetazo";
	}
	
	public int impact() {
		return 10;
	}
	
	public void specialEffect(Character attacker, Character attacked) {
		Random rand = new Random();
		int randomInt = 0;
		randomInt = rand.nextInt(5);
		if(randomInt == 0) {
			System.out.println("¡El ataque ha aturdido!\n");
			attacked.setState(attacked.getStunnedState());
		}
	}
}
