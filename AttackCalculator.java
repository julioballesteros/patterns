import java.util.Random;

public class AttackCalculator {

	private static AttackCalculator uniqueInstance;
	
	private AttackCalculator() {}
	
	public static AttackCalculator getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new AttackCalculator();
		}
		return uniqueInstance;
	}
	
	public void calculateAttackResult(Character attacker, Character attacked, Action action){
		
		if(action == null)	return;
		
		int impact = action.impact();
		int damage = 0;
		Random rand = new Random();
		if(impact > 0)
			damage = impact + attacker.power - attacked.stamina;
			int randomInt = rand.nextInt(20);
			if(randomInt < attacker.getCritic()) {
				damage = damage* 2;
				System.out.println("¡Es un golpe crítico!");
		}
		
		action.specialEffect(attacker, attacked);
		System.out.println("Daño infligido:" + damage + "\n");
		attacked.takeDamage(damage);
	}
}
