package ece325.labs.lab4;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        // Compare by average rating (high to low)
        int ratingCompare = Float.compare(s2.getAverageRating().getAvgRating(), 
                                        s1.getAverageRating().getAvgRating());
        
        // If ratings are equal, compare by number of votes (high to low)
        if (ratingCompare == 0) {
            return Integer.compare(s2.getAverageRating().getVotes(), 
                                 s1.getAverageRating().getVotes());
        }
        return ratingCompare;
    }
}
