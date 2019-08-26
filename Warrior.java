import java.util.Scanner;

public class Warrior extends Player{

		public Warrior(Scanner sc) {
			super(sc);
			health = 100;
			stamina = 20;
			power = 50;
			critic = 1;
			
			actionOne = new Fire(new SwordAttack());
			actionTwo = new PunchAttack();
			actionThree = new Frost(new Shield());
		}
}
