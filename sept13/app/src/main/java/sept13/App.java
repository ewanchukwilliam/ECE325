/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sept13;

public class App {
  public String getGreeting() { return "Hello World!"; }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    Player player1 = new Player("Bob");
    Player player2 = new Player("Alice");
    Player player3 = new Player("Melvin");
    Game runGame = new Game();
    runGame.startGame(player1, player2, player3);
		runGame.startGame(player1, player2, player3);
		

  }
}
