package ece325.labs.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

/** 
 * Finish this class.
 */
public class Song {
	private String title;
	private ArrayList<String> instruments;
	private AverageRating averageRating;

	public Song(String title, ArrayList<String> instruments, AverageRating rating) {
			this.title = (title != null) ? title : "null";
			this.instruments = (instruments != null) ? new ArrayList<>(instruments) : new ArrayList<>();
			this.averageRating = (rating != null) ? rating : new AverageRating(0);
	}
	
	/**
	 * Returns true if the title of and instruments used in the Songs are the same.
	 * Note that you don't have to include the AverageRating in this comparison (as it is not really related to the equality of the Song). 
	 */
	public boolean equals(Object o) {
		if (this == o) return true;  
    if (!(o instanceof Song)) return false;
		Song song = (Song) o;
		return this.equals(song);  
	}
	
	/**
	 * Returns true if the title of and instruments used in the Songs are the same.
	 * Note that you don't have to include the AverageRating in this comparison (as it is not really related to the equality of the Song). 
	 */
	public boolean equals(Song s) {
		if (s == null) return false;
		if (this.title == null || s.getTitle() == null) return false;
    if (this.instruments == null || s.getInstruments() == null) return false;
		if (!this.title.equals(s.getTitle()) || this.instruments.size() != s.getInstruments().size()) return false;
		ArrayList<String> currentInstruments = new ArrayList<>(this.instruments);
		Collections.sort(currentInstruments);
		ArrayList<String> checkInstruments = new ArrayList<>(s.getInstruments());
		Collections.sort(checkInstruments);
		for (int i = 0; i < this.instruments.size(); i++) {
			if (!currentInstruments.get(i).equals(checkInstruments.get(i))) {
				return false;
			}
		}
		return true; 
	}
    public int hashCode() {
        return Objects.hash(title, new HashSet<>(instruments));  
    }
	
	public ArrayList<String> getInstruments(){
		return this.instruments;		
	}
	
	public void addRating(float rating) {
		this.averageRating.addRating(rating);
	}
	
	public AverageRating getRating() {
		return this.averageRating;

	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String toString() {
		return "[Song: " + title + ", instruments: " + instruments + ", avg. rating: " + averageRating + "]"; 
	}



}
