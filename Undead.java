
public abstract class Undead extends Enemy{

	public Undead() {
		health = 50;
		stamina = 6;
		power = 17;
		critic = 3;
		
		actionOne = new ClawAttack();
		actionTwo = new BiteAttack();
		actionThree = new PunchAttack();
	}
}
