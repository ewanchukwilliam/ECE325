import java.util.ArrayList;
import java.util.Arrays;

import ece325.labs.lab3.AverageRating;
import ece325.labs.lab3.Song;
import ece325.labs.lab3.SongCollection;
import ece325.labs.lab3.SongLoader;

public class Main {
	public static void main(String[] args) {
		SongLoader.main(new String[] {});

    System.out.println("\nSame input as part one but removes an instrument from duplicate element");
    String file = "songratings2.txt";
    System.out.println(SongLoader.loadSongs(file));

    System.out.println("\nSame input as part one but added an instrument to duplicate element");
    file = "songratings3.txt";
    System.out.println(SongLoader.loadSongs(file));

    System.out.println("\nTest for nonexistant file: ");
    file = "nonexistantfile.txt";
    System.out.println(SongLoader.loadSongs(file));

    System.out.println("\nTest for a file that is empty: ");
    file = "emptyfile.txt";
    System.out.println(SongLoader.loadSongs(file));

    System.out.println("\nTest for a file not enough semicolons");
    file = "incorrectformat1.txt";
    System.out.println(SongLoader.loadSongs(file));

    System.out.println("\nTest for a file with too many semicolons");
    file = "incorrectformat2.txt";
    System.out.println(SongLoader.loadSongs(file));

    System.out.println("\nTest for invalid format for ratings");
    file = "invalidrating.txt";
    System.out.println(SongLoader.loadSongs(file));

		Song song1 = new Song("Test Song", new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(5));
    Song song2 = new Song("Test Song", new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(5));
    Song song3 = new Song("Test Song 2", new ArrayList<>(Arrays.asList("Piano")), new AverageRating(4));

    // Test SongCollection.add() and SongCollection.contains()




    SongCollection collection = new SongCollection();

    collection.add(song1);
    System.out.println("Should contain song1: " + collection.contains(song1));
    collection.add(song2); // Should update rating, not add new
    System.out.println("Number of songs should be 1: " + collection.getNumberOfSongs());
    // Test SongCollection.remove()
    System.out.println("\nTesting SongCollection.remove()");
    collection.remove(song1);
    System.out.println("Should not contain song1 anymore: " + !collection.contains(song1));
    // Test SongCollection.getSong() and SongCollection.getNumberOfSongs()
    System.out.println("\nTesting SongCollection.getSong() and SongCollection.getNumberOfSongs()");
    collection.add(song1);
    collection.add(song3);
    System.out.println("Should get song1: " + collection.getSong(0).equals(song1));
    System.out.println("Number of songs should be 2: " + collection.getNumberOfSongs());

				// Test containing null song
	
		collection = new SongCollection();
		System.out.println("Should not contain null: " + !collection.contains(null));
		Song songWithNullTitle = new Song(null, new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(5));
		Song songWithNullInstruments = new Song("NullInstruments", null, new AverageRating(5));
    collection.add(songWithNullTitle);
    System.out.println("Adding song with null title did not throw an exception.");
    collection.add(songWithNullInstruments);
    System.out.println("Adding song with null instruments did not throw an exception.");
    collection.remove(null);
    System.out.println("Removing null song did not throw an exception.");
    System.out.println("\nTesting SongCollection.add() and SongCollection.contains()");
    collection.add(null);
    System.out.println("Adding null song did not throw an exception.");

	
		song1 = new Song("Test Song", new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(5));
		song2 = new Song("Test Song", new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(3));
		song3 = new Song("Test Song 2", new ArrayList<>(Arrays.asList("Piano")), new AverageRating(4));

    System.out.println("\nTesting initialized list of songs with a duplicate.");

		System.out.println( new SongCollection(new ArrayList<>(Arrays.asList(song1, song2, song3))));

		song1 = new Song("Test Song", new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(5));
		song2 = new Song("Test Song", new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(5));
		song3 = new Song("Test Song 2", new ArrayList<>(Arrays.asList("Piano")), new AverageRating(4));
		Song song4 = new Song(null,null,null);

    // Test Song.equals()
    System.out.println("\nTesting Song.equals()");
    System.out.println("Should be true: " + song1.equals(song2));
    System.out.println("Should be false: " + song1.equals(song3));
    System.out.println("song equals null should be false: " + song1.equals(null));
    System.out.println("null equals song should be false: " + song4.equals(song1));
    // Test Song.addRating() and Song.getRating()
    System.out.println("\nTesting Song.addRating() and Song.getRating() before: "+ song1.getRating().getAvgRating());
    song1.addRating(3);
    System.out.println("Average should be updated (4.0): " + song1.getRating().getAvgRating());
    // Test Song.getTitle() and Song.getInstruments()
    System.out.println("\nTesting Song.getTitle() and Song.getInstruments()");
    System.out.println("Title should be 'Test Song': " + song1.getTitle());
    System.out.println("Instruments should include 'Guitar' and 'Drums': " + song1.getInstruments());
	
		song1 = new Song("Test Song", new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(5));
		song2 = new Song("Test Song", new ArrayList<>(Arrays.asList("Guitar", "Drums")), new AverageRating(5));
		song3 = new Song("Test Song 2", new ArrayList<>(Arrays.asList("Piano")), new AverageRating(4));

    // Test AverageRating.addRating() and AverageRating.getAvgRating()
    System.out.println("\nTesting AverageRating.addRating() and AverageRating.getAvgRating()");
    AverageRating rating = new AverageRating(5);
    rating.addRating(3);
    System.out.println("Average should be 4.0: " + rating.getAvgRating());
	}
}
