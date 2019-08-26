
public class OutlandDemon extends Demon{
	
	public Action decorateAction(Action action) {
		return new Shadow(action);
	}

}
