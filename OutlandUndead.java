
public class OutlandUndead extends Undead{
	
	public Action decorateAction(Action action) {
		return new Shadow(action);
	}

}
