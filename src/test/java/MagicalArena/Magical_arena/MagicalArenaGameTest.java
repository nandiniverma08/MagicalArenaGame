package MagicalArena.Magical_arena;

import junit.framework.TestCase;
import magical_arena.MagicalArenaGame;
import magical_arena.entity.Player;
import magical_arena.strategyImpl.AttackerClass;
import magical_arena.strategyImpl.DefenderClass;


public class MagicalArenaGameTest
    extends TestCase
{

	public void testPlayGame() {
       
        Player playerA = new Player(100, 20, 15, "PlayerA", new AttackerClass(), new DefenderClass());
        Player playerB = new Player(80, 18, 12, "PlayerB", new AttackerClass(), new DefenderClass());


        int fixedDiceRollA = 3;
        int fixedDiceRollB = 4;

        MagicalArenaGame game = new MagicalArenaGame(playerA, playerB);

        game.playGameWithFixedDiceRolls(fixedDiceRollA, fixedDiceRollB);

        if (playerA.getHealth() <= 0) {
            assertEquals("PlayerB", game.getWinner());
        } else {
            assertEquals("PlayerA", game.getWinner());
        }
    }

	
}
