
public class OutlandEnemyFactory implements EnemyFactory{
	
	public Demon createDemon() {
		Demon demon = new OutlandDemon();
		return demon;
	}
	
	public Undead createUndead() {
		Undead undead = new OutlandUndead();
		return undead;
	}
	
	public Elemental createElemental() {
		Elemental elemental = new OutlandElemental();
		return elemental;
	}

}
