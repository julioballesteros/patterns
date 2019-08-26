
public class Shadow extends ActionDecorator{

	public Shadow(Action action) {
		this.action = action;
	}
	
	public String getDescription() {
		return action.getDescription() + " sombrío";
	}
	
	public int impact() {
		return 5 + action.impact();
	}
	
	public void specialEffect(Character attacker, Character attacked) {
		action.specialEffect(attacker, attacked);
	}
}
