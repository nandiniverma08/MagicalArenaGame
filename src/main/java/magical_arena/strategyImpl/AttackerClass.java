package magical_arena.strategyImpl;

import magical_arena.entity.Player;
import magical_arena.strategy.AttackInterface;

public class AttackerClass implements AttackInterface {

	@Override
	public int attackDone(Player attacker) {
		int totalAttack = attacker.rollDice() * attacker.getAttack();
        System.out.println("Total attack: " + totalAttack);
        return totalAttack;
	}

}
