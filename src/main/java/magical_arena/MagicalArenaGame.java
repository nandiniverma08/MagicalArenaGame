package magical_arena;

import java.util.Scanner;

import magical_arena.entity.Player;
import magical_arena.strategyImpl.AttackerClass;
import magical_arena.strategyImpl.DefenderClass;

public class MagicalArenaGame {
	private Player playerA;
    private Player playerB;

    public MagicalArenaGame(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void playGame() {
        Player firstAttacker;
        Player secondAttacker;

        // Determine the player with lower health to attack first
        if (playerA.getHealth() <= playerB.getHealth()) {
            firstAttacker = playerA;
            secondAttacker = playerB;
        } else {
            firstAttacker = playerB;
            secondAttacker = playerA;
        }

        while (firstAttacker.getHealth() > 0 && secondAttacker.getHealth() > 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("Player A (" + playerA.getName() + ") Health: " + playerA.getHealth()
                    + ", Player B (" + playerB.getName() + ") Health: " + playerB.getHealth());

            // Attack by the player with lower health
            if (firstAttacker == playerA) {
                playerAAttack(playerB);
            } else {
                playerBAttack(playerA);
            }

            // Switch attacker and defender for the next turn
            Player temp = firstAttacker;
            firstAttacker = secondAttacker;
            secondAttacker = temp;
        }

        // Determine the winner
        if (playerA.getHealth() <= 0) {
            System.out.println(playerB.getName() + " wins!");
        } else {
            System.out.println(playerA.getName() + " wins!");
        }
    }



    public void playerAAttack(Player defender) {
        System.out.println("Player A's turn:");
        int damage = playerA.totalDamage();
        System.out.println("damage " + damage);
        int defense = defender.totalDefense();
        System.out.println("defense " + defense);
        int damageDone = Math.max(0, damage - defense);
        System.out.println("damageDone " + damageDone);

        defender.reduceHealth(damageDone);

        System.out.println("Player A (" + playerA.getName() + ") attacks, results " + damageDone +
                " damage. Player B (" + defender.getName() + ") health: " + defender.getHealth());
    }

    public void playerBAttack(Player defender) {
        System.out.println("Player B's turn:");
        int damage = playerB.totalDamage();
        System.out.println("damage  " + damage);
        int defense = defender.totalDefense();
        System.out.println("defense " + defense);
        int damageDone = Math.max(0, damage - defense);
        System.out.println("damageDone " + damageDone);

        defender.reduceHealth(damageDone);

        System.out.println("Player B (" + playerB.getName() + ") attacks, results " + damageDone +
                " damage. Player A (" + defender.getName() + ") health: " + defender.getHealth());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's begin the game!");

        // Choose the player for Team A
        System.out.println("Enter the name for Team A:");
        String playerAName = scanner.nextLine();

        // Enter the health, strength, and attack for Team A
        System.out.println("Enter the health for Team A:");
        int playerAHealth = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the strength for Team A:");
        int playerAStrength = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the attack for Team A:");
        int playerAAttack = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Choose the player for Team B
        System.out.println("Enter the name for Team B:");
        String playerBName = scanner.nextLine();

        // Enter the health, strength, and attack for Team B
        System.out.println("Enter the health for Team B:");
        int playerBHealth = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the strength for Team B:");
        int playerBStrength = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the attack for Team B:");
        int playerBAttack = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Player playerA = new Player(playerAHealth, playerAStrength, playerAAttack, playerAName,
                new AttackerClass(), new DefenderClass());

        Player playerB = new Player(playerBHealth, playerBStrength, playerBAttack, playerBName,
                new AttackerClass(), new DefenderClass());

        MagicalArenaGame game = new MagicalArenaGame(playerA, playerB);

        System.out.println("Initial State - Player A (" + playerA.getName() + ") Health: " + playerA.getHealth() +
                ", Player B (" + playerB.getName() + ") Health: " + playerB.getHealth());

        game.playGame();

        System.out.println("Final State - Player A (" + playerA.getName() + ") Health: " + playerA.getHealth() +
                ", Player B (" + playerB.getName() + ") Health: " + playerB.getHealth());
    }
}