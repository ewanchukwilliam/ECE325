package ece325.labs.lab3;

public class InvalidSongFormatException extends Exception {
  private static final long serialVersionUID = 1L;  
	public InvalidSongFormatException(String message) {
		super(message);
	}
}
