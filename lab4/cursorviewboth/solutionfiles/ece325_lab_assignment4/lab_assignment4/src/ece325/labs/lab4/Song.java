package ece325.labs.lab4;

/**
 * This class represents a Song. A Song has a title and an average rating.
 * You are not allowed to change the code that is in between the indications, but you are allowed to add
 * code before and after the indicate lines.
 * 
 * @author Cor-Paul Bezemer
 *
 */
public class Song implements Comparable<Song> {
	// not allowe to change anything after this (until the next marker which says you can add code again)
	private String title;
	private AverageRating rating;
	
	public Song(String title, AverageRating rating) {
		this.title = title;
		this.rating = rating;
	}

	public String getTitle() {
		return this.title;
	}

	public AverageRating getAverageRating() {
		return this.rating;
	}
	
	public void setTitle(String s) {
		title = s;
	}
	
	public void setAverageRating(AverageRating rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return "[Song: " + title + ", average rating: " + rating + "]";
	}
	
	// You are allowed to make changes or add code after this line
	
	@Override
	public int compareTo(Song other) {
		return this.title.compareTo(other.title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Song other = (Song) obj;
		return title.equals(other.title);
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}
}
