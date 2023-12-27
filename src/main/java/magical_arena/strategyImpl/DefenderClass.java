package magical_arena.strategyImpl;

import magical_arena.entity.Player;
import magical_arena.strategy.DefenseInterface;

public class DefenderClass implements DefenseInterface {

	@Override
	public int damageDone(Player defender) {
		int totalDefense = defender.rollDice() * defender.getStrength();
		System.out.println("Total defense: " + totalDefense);
		return totalDefense;
	}

}
