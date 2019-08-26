
public class AzerothEnemyFactory implements EnemyFactory{
	
	public Demon createDemon() {
		Demon demon = new AzerothDemon();
		return demon;
	}
	
	public Undead createUndead() {
		Undead undead = new AzerothUndead();
		return undead;
	}
	
	public Elemental createElemental() {
		Elemental elemental = new AzerothElemental();
		return elemental;
	}

}
