
public class StunnedState implements State{

	private Character character;
	private int roundsLeft;
	
	public StunnedState(Character character) {
		this.character = character;
		roundsLeft = 1;
	}
	
	public boolean canAction() {
		roundsLeft --;
		System.out.println("¡Estas aturdido! No puedes atacar");
		if(roundsLeft == 0)
			character.setState(character.getActiveState());
		return false;
	}
	
	public void setRoundsLeft(){
		roundsLeft = 1;
	}
	
}
