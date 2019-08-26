
public class FirelandsEnemyFactory implements EnemyFactory{
	
	public Demon createDemon() {
		Demon demon = new FirelandsDemon();
		return demon;
	}
	
	public Undead createUndead() {
		Undead undead = new FirelandsUndead();
		return undead;
	}
	
	public Elemental createElemental() {
		Elemental elemental = new FirelandsElemental();
		return elemental;
	}

}
