
public class Fire extends ActionDecorator{

	public Fire(Action action) {
		this.action = action;
	}
	
	public String getDescription() {
		return action.getDescription() + " flamígero";
	}
	
	public int impact() {
		return 3 + action.impact();
	}
	
	public void specialEffect(Character attacker, Character attacked) {
		System.out.println("¡El ataque ha producido una quemadura!\n");
		attacked.setState(attacked.getBurningState());
	}
}
