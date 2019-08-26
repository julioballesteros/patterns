import java.util.Scanner;

public class Druid extends Player{

	public Druid(Scanner sc) {
		super(sc);
		health = 90;
		stamina = 17;
		power = 40;
		critic = 3;
		
		actionOne = new Fire(new ClawAttack());
		actionTwo = new Fire(new BiteAttack());
		actionThree = new Shadow(new HealSpell());
	}
}
