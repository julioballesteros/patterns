import java.util.Scanner;

public class Mage extends Player{

	public Mage(Scanner sc) {
		super(sc);
		health = 80;
		stamina = 15;
		power = 30;
		critic = 5;
		
		actionOne = new Fire(new MagicAttack());
		actionTwo = new Frost(new MagicAttack());
		actionThree = new HealSpell();
	}
}
