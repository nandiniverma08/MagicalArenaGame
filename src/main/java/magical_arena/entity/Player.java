package magical_arena.entity;

import java.util.Random;

import magical_arena.strategy.AttackInterface;
import magical_arena.strategy.DefenseInterface;

public class Player {
	
	int health;
	int strength;
	int attack;
	String name; 
	private AttackInterface attackInterface;
	private DefenseInterface defenseInterface;
	
	private int fixedDiceRoll;
	
	
	public Player(int health, int strength, int attack, String name, AttackInterface attackInterface,
            DefenseInterface defenseInterface) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;  
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
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void reduceHealth(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int rollDice() {
        if (fixedDiceRoll > 0) {
            return fixedDiceRoll;
        }

        return new Random().nextInt(6) + 1;
    }
	
	public int totalDamage() {
	    return rollDice() * attackInterface.attackDone(this);
	}


    public int totalDefense() {
        return defenseInterface.damageDone(this);
    }

    public void setAttack(AttackInterface attackInterface) {
        this.attackInterface = attackInterface;
    }

    public void setDefense(DefenseInterface defenseInterface) {
        this.defenseInterface = defenseInterface;
    }
	
    
    public void setFixedDiceRoll(int fixedDiceRoll) {
        this.fixedDiceRoll = fixedDiceRoll;
    }

	

}