
public class BleedingState implements State{

	private Character character;
	private int roundsLeft;
	
	public BleedingState(Character character) {
		this.character = character;
		roundsLeft = 2;
	}
	
	public boolean canAction() {
		character.takeDamage(4);
		roundsLeft --;
		System.out.println("¡Estas sangrando y pierdes vida!");
		if(roundsLeft == 0)
			character.setState(character.getActiveState());
		return true;
	}
	
	public void setRoundsLeft(){
		roundsLeft = 2;
	}
	
}