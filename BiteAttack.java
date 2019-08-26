
public class BiteAttack extends Action{

	public BiteAttack() {
		description = "Mordisco";
	}
	
	public int impact() {
		return 25;
	}
	
	public void specialEffect(Character attacker, Character attacked) {
		System.out.println("¡El ataque ha provocado que sangre!\n");
		attacked.setState(attacked.getBleedingState());
	}
}
