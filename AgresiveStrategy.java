
public class AgresiveStrategy implements Strategy{

	public Action decideAction(Action actionOne, Action actionTwo, Action actionThree, int health) {
		Action action = null;
		
		if(health > 15) {
			action = actionOne;
		}
		else if(health > 5) {
			action = actionTwo;
		}
		else {
			action = actionThree;
		}
		return action;
	}
}
