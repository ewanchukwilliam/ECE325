import ece325.labs.lab4.SongCollection;
import ece325.labs.lab4.Song;
import ece325.labs.lab4.AverageRating;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		SongCollection.main(args);

		// // Test case 1: Basic functionality with normal data
		// System.out.println("=== Test 1: Basic Functionality ===");
		// SongCollection normalColl = new SongCollection();
		// normalColl.loadSongs("songratings.txt");
		// System.out.println("Natural order (by title):");
		// System.out.println(normalColl);
		// System.out.println("\nSorted by rating:");
		// System.out.println(normalColl.sort());
		//
		// // Test case 2: HashSet functionality with duplicates
		// System.out.println("\n=== Test 2: HashSet Duplicate Handling ===");
		// HashSet<Song> songSet = new HashSet<>();
		// Song song1 = new Song("Test Song", new AverageRating(4.5f, 100));
		// Song song2 = new Song("Test Song", new AverageRating(4.0f, 50));  // Same title
		// Song song3 = new Song("Different Song", new AverageRating(4.5f, 100));
		// songSet.add(song1);
		// songSet.add(song2);
		// songSet.add(song3);
		// System.out.println("HashSet size (should be 2): " + songSet.size());
		// System.out.println("HashSet contents:");
		// songSet.forEach(System.out::println);
		//
		// // Test case 3: Edge cases for sorting
		// System.out.println("\n=== Test 3: Sorting Edge Cases ===");
		// SongCollection edgeColl = new SongCollection();
		// // Same rating, different votes
		// edgeColl.addSong(new Song("A", new AverageRating(4.5f, 100)));
		// edgeColl.addSong(new Song("B", new AverageRating(4.5f, 200)));
		// // Extreme ratings
		// edgeColl.addSong(new Song("C", new AverageRating(5.0f, 1)));
		// edgeColl.addSong(new Song("D", new AverageRating(0.0f, 1000)));
		// System.out.println("Natural order:");
		// System.out.println(edgeColl);
		// System.out.println("\nSorted by rating:");
		// System.out.println(edgeColl.sort());
		//
		// // Test case 4: Empty collection
		// System.out.println("\n=== Test 4: Empty Collection ===");
		// SongCollection emptyColl = new SongCollection();
		// System.out.println("Empty natural order:");
		// System.out.println(emptyColl);
		// System.out.println("Empty sorted:");
		// System.out.println(emptyColl.sort());
		//
		// // Test case 5: Single element collection
		// System.out.println("\n=== Test 5: Single Element ===");
		// SongCollection singleColl = new SongCollection();
		// singleColl.addSong(new Song("Lonely Song", new AverageRating(3.0f, 1)));
		// System.out.println("Single natural order:");
		// System.out.println(singleColl);
		// System.out.println("Single sorted:");
		// System.out.println(singleColl.sort());
		//
		// // Test case 6: Same rating and votes
		// System.out.println("\n=== Test 6: Equal Ratings and Votes ===");
		// SongCollection equalColl = new SongCollection();
		// equalColl.addSong(new Song("Z", new AverageRating(4.0f, 100)));
		// equalColl.addSong(new Song("Y", new AverageRating(4.0f, 100)));
		// equalColl.addSong(new Song("X", new AverageRating(4.0f, 100)));
		// System.out.println("Natural order:");
		// System.out.println(equalColl);
		// System.out.println("Sorted by rating (should maintain stable order for equal ratings/votes):");
		// System.out.println(equalColl.sort());
		//
		// // Test case 7: HashSet behavior with differently sorted collections
		// System.out.println("\n=== Test 7: HashSet with Different Sort Orders ===");
		// SongCollection originalColl = new SongCollection();
		// originalColl.addSong(new Song("A", new AverageRating(3.0f, 100)));
		// originalColl.addSong(new Song("B", new AverageRating(4.0f, 200)));
		// originalColl.addSong(new Song("C", new AverageRating(5.0f, 300)));
		//
		// // Create sorted version
		// SongCollection ratingColl = originalColl.sort();
		//
		// // Create HashSet and add both collections' songs
		// HashSet<Song> mixedSet = new HashSet<>();
		// mixedSet.addAll(originalColl.getCollection());
		// mixedSet.addAll(ratingColl.getCollection());
		//
		// System.out.println("Original collection (by title):");
		// System.out.println(originalColl);
		// System.out.println("\nRating-sorted collection:");
		// System.out.println(ratingColl);
		// System.out.println("\nHashSet size (should be 3): " + mixedSet.size());
		// System.out.println("HashSet contents (should have no duplicates):");
		// mixedSet.forEach(System.out::println);
		//
		// // Test equality between songs from different collections
		// Song songFromOriginal = originalColl.getCollection().iterator().next();
		// Song songFromSorted = ratingColl.getCollection().iterator().next();
		// System.out.println("\nComparing same song from different collections:");
		// System.out.println("Same title songs equal? " + 
		// 	songFromOriginal.equals(songFromSorted));
		// System.out.println("HashCodes equal? " + 
		// 	(songFromOriginal.hashCode() == songFromSorted.hashCode()));
	}
}
