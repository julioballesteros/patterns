
public class BurningState implements State{

	private Character character;
	private int roundsLeft;
	
	public BurningState(Character character) {
		this.character = character;
		roundsLeft = 2;
	}
	
	public boolean canAction() {
		character.takeDamage(5);
		roundsLeft --;
		System.out.println("¡Estas quemado y pierdes vida!");
		if(roundsLeft == 0)
			character.setState(character.getActiveState());
		return true;
	}
	
	public void setRoundsLeft(){
		roundsLeft = 2;
	}
}
