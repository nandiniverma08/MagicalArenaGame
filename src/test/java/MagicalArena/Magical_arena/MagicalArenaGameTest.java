package MagicalArena.Magical_arena;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import magical_arena.MagicalArenaGame;
import magical_arena.entity.Player;
import magical_arena.strategyImpl.AttackerClass;
import magical_arena.strategyImpl.DefenderClass;

/**
 * Unit test for simple App.
 */
public class MagicalArenaGameTest 
    extends TestCase
{
//	public void testPlayGame() {
//        Player playerA = new Player(80, 10, 40, new AttackerClass(), new DefenderClass());
//        Player playerB = new Player(45, 8, 90, new AttackerClass(), new DefenderClass());
//
//        MagicalArenaGame game = new MagicalArenaGame(playerA, playerB);
//
//        // Assuming that playGame modifies playerA and playerB
//        game.playGame();
//
//        // Ensure that either playerA or playerB has health <= 0
//        assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
//    }
//
//    public void testPlayerAAttack() {
//        Player playerA = new Player(80, 10, 40, new AttackerClass(), new DefenderClass());
//        Player playerB = new Player(45, 8, 90, new AttackerClass(), new DefenderClass());
//
//        MagicalArenaGame game = new MagicalArenaGame(playerA, playerB);
//
//        // Assuming that playerAAttack modifies playerB
//        game.playerAAttack(playerB);
//
//        // Ensure that playerB's health is reduced
//        assertTrue(playerB.getHealth() < 45);
//    }
//
//    public void testPlayerBAttack() {
//        Player playerA = new Player(80, 10, 40, new AttackerClass(), new DefenderClass());
//        Player playerB = new Player(45, 8, 90, new AttackerClass(), new DefenderClass());
//
//        MagicalArenaGame game = new MagicalArenaGame(playerA, playerB);
//
//        // Assuming that playerBAttack modifies playerA
//        game.playerBAttack(playerA);
//
//        // Ensure that playerA's health is reduced
//        assertTrue(playerA.getHealth() < 80);
//    }
//
////    public void testPlayerAInitialTotalDamage() {
////        Player playerA = new Player(80, 10, 40, new AttackerClass(), new DefenderClass());
////
////        // Assuming that totalDamage() does not modify the player state
////        int totalDamage = playerA.totalDamage();
////
////        // Ensure that totalDamage is within the expected range based on the rollDice and attack values
////        assertTrue(totalDamage >= 40 && totalDamage <= 240);
////    }
//
//    public void testPlayerBInitialTotalDefense() {
//        Player playerB = new Player(45, 8, 90, new AttackerClass(), new DefenderClass());
//
//        // Assuming that totalDefense() does not modify the player state
//        int totalDefense = playerB.totalDefense();
//
//        // Ensure that totalDefense is within the expected range based on the rollDice and strength values
//        assertTrue(totalDefense >= 8 && totalDefense <= 48);
//    }
}
