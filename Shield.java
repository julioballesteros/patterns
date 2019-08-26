
public class Shield extends Action{

	public Shield() {
		description = "Escudo";
	}
	
	public int impact() {
		return 0;
	}
	
	public void specialEffect(Character attacker, Character attacked) {
		//Proteger al usar el escudo
		System.out.println("¡El aguante ha sido aumentado!\n");
		attacker.increaseStamina(5);
	}
	
}
