package ece325.labs.lab3;

/**
 * Finish this class.
 */
public class AverageRating {
  private float avgRating;
  private float sumRating;
  private int count;

  public AverageRating(float rating) {
    this.count = 1;
    this.sumRating = rating;
    this.avgRating = rating;
  }

  /**
   * Recomputes the average rating taking the new rating r into account.
   * @param rating
   */
  public void addRating(float r) {
    this.sumRating += r;
    this.count++;
		this.avgRating = this.sumRating / this.count;
  }

  public float getAvgRating() {
    return this.avgRating;
  }
  public String toString() { 
		return "[AverageRating: " + avgRating + "]";
	}
}
