package ece325.labs.lab3;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Finish this class.
 */
public class SongCollection {
  private ArrayList<Song> songs;

  public SongCollection() {
		this.songs = new ArrayList<>();
	}
	public SongCollection(ArrayList<Song> listofSongs) {
		this.songs = new ArrayList<>();
		for (Song song : listofSongs) {
			this.add(song);
		}
	}

  /**
   * Add the song if it is not in the list yet, otherwise update the average
   * rating of the song.
   *
   * @param s
   */
  public void add(Song s) {
		boolean exists = false;
    for (Song song : this.songs) {
      if (song.equals(s)) {
        song.getRating().addRating(s.getRating().getAvgRating());
				exists=true;
				break;
      }
    }
		if (exists==false) {
			this.songs.add(s);
		}
  }

  public void remove(Song s) { 
    Iterator<Song> iterator = this.songs.iterator();
    while (iterator.hasNext()) {
        Song song = iterator.next();
        if (song.equals(s)) {
            iterator.remove(); 
        }
    }
	}

  public boolean contains(Song s) {
		return this.songs.contains(s);
  }

  public Song getSong(int index) {
		return this.songs.get(index);
	}

  public int getNumberOfSongs() {
		return this.songs.size();
	}

  public ArrayList<Song> getSongs() {
		return this.songs;
	}

  public String toString() {
    String toRet = "[SongCollection: ";
    for (Song s : songs)
      toRet += "\n\t" + s + "; ";
    return toRet + "\n]";
  }

}
