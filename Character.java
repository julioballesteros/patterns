
public abstract class Character {

	protected int health;
	protected int stamina;
	protected int power;
	protected int critic;
		
	protected State activeState;
	protected State stunnedState;
	protected State bleedingState;
	protected State burningState;
	protected State currentState;
	
	protected Action actionOne;
	protected Action actionTwo;
	protected Action actionThree;
	
	public Character() {
		activeState = new ActiveState(this);
		stunnedState = new StunnedState(this);
		bleedingState = new BleedingState(this);
		burningState = new BurningState(this);
		currentState = activeState;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStamina() {
		return stamina;
	}
	
	public int getPower() {
		return power;
	}
	
	public int getCritic() {
		return critic;
	}
	
	public void takeDamage(int damage) {
		health -= damage;
	}
	
	public void heal(int healing) {
		health += healing;
	}
	
	public void increaseStamina(int points) {
		stamina += points;
	}
	
	public void setState(State newState) {
		currentState = newState;
		currentState.setRoundsLeft();
	}
	
	public State getActiveState() {
		return activeState;
	}
	
	public State getBleedingState() {
		return bleedingState;
	}
	
	public State getStunnedState() {
		return stunnedState;
	}
	
	public State getBurningState() {
		return burningState;
	}
	
	public boolean isAlive() {
		if(health > 0)
			return true;
		else
			return false;
	}
	
	public Action doActionOne() {
		return actionOne;
	}
	
	public Action doActionTwo() {
		return actionTwo;
	}
	
	public Action doActionThree() {
		return actionThree;
	}
	
	public Action nextAction() {
		Action action = null;
		if(currentState.canAction())
			action = getNextAction();
		return action;
	}
	
	public abstract Action getNextAction();
	
	
}
