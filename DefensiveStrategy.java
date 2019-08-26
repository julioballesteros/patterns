
public class DefensiveStrategy implements Strategy{

	public Action decideAction(Action actionOne, Action actionTwo, Action actionThree, int health) {
		Action action = null;
		
		if(health > 25) {
			action = actionOne;
		}
		else if(health > 15) {
			action = actionTwo;
		}
		else {
			action = actionThree;
		}
		return action;
	}
}
