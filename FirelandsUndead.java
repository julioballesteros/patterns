
public class FirelandsUndead extends Undead{
	
	public Action decorateAction(Action action) {
		return new Fire(action);
	}

}
