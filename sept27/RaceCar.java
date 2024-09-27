public class RaceCar extends Car {
  public RaceCar() {
    this.maxSpeed = 350;
  }
  public void race() {
    System.out.println("the RaceCar goes vroom at this speed: " + this.maxSpeed);
  }
}
