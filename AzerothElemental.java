
public class AzerothElemental extends Elemental{
	
	public Action decorateAction(Action action) {
		return new Frost(action);
	}

}
