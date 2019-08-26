
public class BalancedStrategy implements Strategy{

	public Action decideAction(Action actionOne, Action actionTwo, Action actionThree, int health) {
		Action action = null;
		
		if(health > 20) {
			action = actionOne;
		}
		else if(health > 10) {
			action = actionTwo;
		}
		else {
			action = actionThree;
		}
		return action;
	}
	
}
