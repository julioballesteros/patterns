
public class AzerothUndead extends Undead{
	
	public Action decorateAction(Action action) {
		return new Frost(action);
	}

}
