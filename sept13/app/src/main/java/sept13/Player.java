
package sept13;

public class Player {
	private int guess = 0;
	private String name = "Null";
	public Player(String playerName){
		this.name = playerName;
	}
	public int generateGuess() {
		this.guess = (int ) ( Math.random() * 10 );
		return this.guess;
	}
	public String getName() {
		return this.name;
	}
	public int getGuess() {
		return this.guess;
	}
}
