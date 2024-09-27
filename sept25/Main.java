public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    RaceCar fastCar = new RaceCar();
    System.out.println("this is the Car speed: " + car.getSpeed());
    System.out.println("this is the RaceCars speed: " + fastCar.getSpeed());
    fastCar.race();
  }
}
