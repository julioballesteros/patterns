
public class FirelandsElemental extends Elemental{
	
	public Action decorateAction(Action action) {
		return new Fire(action);
	}

}
