
public abstract class Action {
	
	protected String description;
	
	public String getDescription() {
		return description;
	}

	public abstract int impact();
	
	public abstract void specialEffect(Character attacker, Character attacked);
}
