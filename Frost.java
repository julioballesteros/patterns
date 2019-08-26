
public class Frost extends ActionDecorator{

	public Frost(Action action) {
		this.action = action;
	}
	
	public String getDescription() {
		return action.getDescription() + " helado";
	}
	
	public int impact() {
		return 4 + action.impact();
	}
	
	public void specialEffect(Character attacker, Character attacked) {
		action.specialEffect(attacker, attacked);
	}
}
