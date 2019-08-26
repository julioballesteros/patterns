
public abstract class Demon extends Enemy{
	
	public Demon() {
		health = 60;
		stamina = 8;
		power = 20;
		critic = 1;
		
		actionOne = new SwordAttack();
		actionTwo = new PunchAttack();
		actionThree = new Shield();
	}

}
