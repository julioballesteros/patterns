
public class AzerothDemon extends Demon{
	
	public Action decorateAction(Action action) {
		return new Frost(action);
	}

}
