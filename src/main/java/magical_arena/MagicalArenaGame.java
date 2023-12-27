package magical_arena;

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
		while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
			System.out.println("--------------------------------------------------");
			System.out.println("Player A Health: " + playerA.getHealth() + ", Player B Health: " + playerB.getHealth());

			playerAAttack(playerB);
			if (playerB.getHealth() <= 0) {
				System.out.println("Player A wins!");
				break;
			}

		}
	}

	private void playerAAttack(Player defender) {
		System.out.println("Player A's turn:");
		int damage = playerA.totalDamage();
		System.out.println("damage " + damage);
		int defense = defender.totalDefense();
		System.out.println("defense " + defense);
		int damageDone = Math.max(0, damage - defense);
		System.out.println("damageDone " + damageDone);

		defender.reduceHealth(damageDone);

		System.out.println(
				"Player A attacks, results " + damageDone + " damage. Player B health: " + defender.getHealth());
	}

	

	public static void main(String[] args) {
		
		Player playerA = new Player(50, 5, 10, new AttackerClass(), new DefenderClass());
		
		MagicalArenaGame game = new MagicalArenaGame(playerA, playerB);

	

		game.playGame();
		
	}
}