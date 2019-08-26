
public class OutlandElemental extends Elemental{
	
	public Action decorateAction(Action action) {
		return new Shadow(action);
	}

}
