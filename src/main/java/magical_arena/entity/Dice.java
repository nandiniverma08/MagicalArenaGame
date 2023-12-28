package magical_arena.entity;

import java.util.Random;

public class Dice {
	
	
    public int rollDice() {
        int rolledValue = new Random().nextInt(6) + 1;
        
        if (rolledValue < 1 || rolledValue > 6) {
            throw new IllegalStateException("Invalid dice roll value: " + rolledValue);
        }

        return rolledValue;
    }
}
