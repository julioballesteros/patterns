import java.util.Random;

public abstract class Enemy extends Character{
	
	private Strategy strategy;
	
	public Enemy() {
		Random rand = new Random();
		int randInt = rand.nextInt(3);
		switch(randInt) {
		case 0:
			strategy = new AgresiveStrategy(); 
			break;
		case 1:
			strategy = new DefensiveStrategy(); 
			break;
		case 2:
			strategy = new BalancedStrategy();
		}
	}
	
	public Action getNextAction() {
		Action action = null;
		action = strategy.decideAction(actionOne, actionTwo, actionThree, health);
		if(action.impact() > 0)
			action = decorateAction(action);
		return action;
	}
	
	public abstract Action decorateAction(Action action);

}
