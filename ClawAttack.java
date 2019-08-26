
public class ClawAttack extends Action{

	public ClawAttack() {
		description = "Zarpazo";
	}
	
	public int impact() {
		return 20;
	}
	
	public void specialEffect(Character attacker, Character attacked) {
		System.out.println("¡El ataque ha provocado que sangre!\n");
		attacked.setState(attacked.getBleedingState());
	}
}
