
public class ActiveState implements State{
	
	private Character character;
	
	public ActiveState(Character character) {
		this.character = character;
	}
	
	public boolean canAction() {
		return true;
	}
	
	public void setRoundsLeft() {}

}
