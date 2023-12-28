

Magical Arena Game

->  The Magical Arena Game is a Java-based turn-based battle game where two players compete to defeat each other using magical powers.
 	Players take turns attacking each other, and the game is won by the player who reduces their opponent's health to zero.



Table of Contents
1.Getting Started
Prerequisites
Running the Game
Game Rules
Test Cases
Project Structure


1.Getting Started
   1.1Prerequisites
     Java Development Kit (JDK): Ensure that you have Java JDK installed on your machine.
      You can download it from Oracle JDK or OpenJDK.
      
   1.2Running the Game
     a.Open a terminal or command prompt.

     b. Navigate to the project directory.

     c. Compile the Java files:
	``` javac MagicalArena/Magical_arena/*.java
	```
	 d. Run the game:
	 ``` java MagicalArena.Magical_arena.MagicalArenaGame
	 ```
	 
	 e. Follow the on-screen instructions to enter player names, health, strength, and attack values for Team A and Team B.

     f. Enjoy the magical arena battle!
     
     
2. Game Rules


    2.1 Turn-Based: Players take turns attacking each other.
		Health: The player with lower health attacks first.
		Dice Rolls: Dice rolls determine the attack and defense outcomes.
		
		
3. Test Case 


    3.1 Test cases for the game logic are available in the MagicalArenaGameTest class. 
    You can run these tests to ensure the correctness of the game logic.
    
    ```javac MagicalArena/Magical_arena/MagicalArenaGameTest.java
		java junit.textui.TestRunner MagicalArena.Magical_arena.MagicalArenaGameTest
	```
	
	
4. Project Structure

   
   4.1  MagicalArenaGame: Main class that creates the game logic and here starts execution of program.
		Player: Class representing a Entity player with fields health, strength, attack, and extra methods like dice and Setting Interfaces
		AttackInterface, DefenseInterface: Interfaces defining attack and defense behavior loosely coupled methods in it.
		AttackerClass, DefenderClass: Implementations of attack and defense Interfaces.
		MagicalArenaGameTest: JUnit test class for testing game logic.
   
	
    		
    
         
