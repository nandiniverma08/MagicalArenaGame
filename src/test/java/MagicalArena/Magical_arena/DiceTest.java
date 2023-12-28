package MagicalArena.Magical_arena;

import junit.framework.TestCase;
import magical_arena.entity.Dice;

public class DiceTest extends TestCase {
	
	
	public void testRollDice() {
        Dice dice = new Dice();

        try {
            int rolledValue = dice.rollDice();
            
            assertTrue("Invalid dice roll value", rolledValue >= 1 && rolledValue <= 6);

        } catch (IllegalStateException e) {
            fail("Exception caught: " + e.getMessage());
        }
    }

}

