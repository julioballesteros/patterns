
public class HealSpell extends Action{

	public HealSpell() {
		description = "Hechizo de sanación";
	}
	
	public int impact() {
		return 0;
	}
	
	public void specialEffect(Character attacker, Character attacked) {
		System.out.println("¡Se ha restaurado parte de la salud!\n");
		attacker.heal(20);
	}
}
