package ece325.labs.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Finish this class.
 */
public class SongLoader {
  /**
   * Load a SongCollection from a file. Uses one or more Scanners to read the
   * file, create Song objects and insert them into a SongCollection.
   *
   *
   * The input is of the format: Songtitle; Instruments; Rating
   * Contribution;Guitar,Guitar,Drums;4.5
   *
   * (see songratings.txt for the full input)
   *
   * @param file
   * @return the loaded SongCollection
   */
  public static SongCollection loadSongs(String file) {
    SongCollection songCollection = new SongCollection();
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        try {
          Song song = parseSong(line);
          songCollection.add(song);
        } catch (InvalidSongFormatException e) {
          System.err.println("Invalid song format: " + e.getMessage());
        }
      }
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
    return songCollection;
  }

  /**
   * Parse a Song object from the String and return it. If the String cannot be
   * parsed into a Song, throw an InvalidSongFormatException.
   *
   * @param songString
   * @return
   * @throws InvalidSongFormatException
   */
  public static Song parseSong(String songString)
      throws InvalidSongFormatException {
    String[] parts = songString.split(";");
    if (parts.length != 3) {
      throw new InvalidSongFormatException(
          "Incorrect number of fields in song entry: length: " + parts.length+ " correct #3");
    }
    String title = parts[0].trim();
    ArrayList<String> instruments = parseInstrumentsList(parts[1]);
    float rating;
    try {
      rating = Float.parseFloat(parts[2].trim());
    } catch (NumberFormatException e) {
      throw new InvalidSongFormatException("Rating is not a valid number: " + parts[2].trim() + " is not a float" );
    }
    return new Song(title, instruments, new AverageRating(rating));
  }

  /**
   * Uses a scanner to parse the instruments string into an ArrayList of String
   * objects. You can assume that the string comes in CSV
   * (comma-separated-value) format, and that it is valid CSV (so no need to do
   * error checking or account for issues with the data).
   *
   * @param instruments
   * @return an ArrayList with one String per parsed instrument
   */
  public static ArrayList<String> parseInstrumentsList(String instruments) {
    ArrayList<String> instrumentList =
        new ArrayList<>(Arrays.asList(instruments.split(",")));
    Collections.sort(instrumentList);
    return instrumentList;
  }

  public static void main(String[] args) {
    String file = "songratings.txt";
    System.out.println(SongLoader.loadSongs(file));
  }
}
