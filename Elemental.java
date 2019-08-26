
public abstract class Elemental extends Enemy{

	public Elemental() {
		health = 40;
		stamina = 5;
		power = 15;
		critic = 5;
		
		actionOne = new SwordAttack();
		actionTwo = new MagicAttack();
		actionThree = new HealSpell();
	}
}
