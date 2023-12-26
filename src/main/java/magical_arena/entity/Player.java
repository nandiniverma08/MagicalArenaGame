package magical_arena.entity;

import magical_arena.strategy.AttackInterface;
import magical_arena.strategy.DefenseInterface;

public class Player {
	
	int health;
	int strength;
	int attack;
	private AttackInterface attackInterface;
	private DefenseInterface defenseInterface;
	
	
	
	
	public Player(int health, int strength, int attack, AttackInterface attackInterface,
			DefenseInterface defenseInterface) {
		super();
		this.health = health;
		this.strength = strength;
		this.attack = attack;
		this.attackInterface = attackInterface;
		this.defenseInterface = defenseInterface;
	}
	
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
	
	

}
