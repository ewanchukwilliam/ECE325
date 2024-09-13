package sept13;

public class Game {
  private int target = (int )( Math.random() * 10 );
  private boolean gameWon = false;
  public void checkGuess(Player p) {
		System.out.println(p.getName() + " guessed: " + p.generateGuess());
    if (p.getGuess() == this.target) {
      this.gameWon = true;
			System.out.println("we have a winner! " + p.getName() + " guessed " + p.getGuess());
    }
  }
  public void startGame(Player p1, Player p2, Player p3) {
    System.out.println("Our Players are ," + p1.getName() + ", " + p2.getName() + ", " + p3.getName());
    System.out.println("They are trying to guess " + this.target);

    while (true) {
			this.checkGuess(p1);
			if(this.gameWon) break;
			this.checkGuess(p2);
			if(this.gameWon) break;
			this.checkGuess(p3);
			if(this.gameWon) break;
    }
  }
	public void javanew() {
		System.out.println("this is a testing message");
	}
}
