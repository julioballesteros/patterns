
public class FirelandsDemon extends Demon{
	
	public Action decorateAction(Action action) {
		return new Fire(action);
	}

}
