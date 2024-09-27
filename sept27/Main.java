import java.util.ArrayList;

public class Main {
	public void lesson1() {
    Car car = new Car();
    Car rc2 = new RaceCar();
    RaceCar r3 = new RaceCar();
    RaceTrack race = new RaceTrack(car, rc2, r3);
		System.out.println("this is the fastest speed of all cars: " + race.getFastestCar().maxSpeed);
		System.out.println("this is the slowest speed of all cars: " + race.getSlowestCar().maxSpeed);
		
	}
  public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<RaceCar> racecars = new ArrayList<RaceCar>();

		Car car = new Car();
		RaceCar rc1 = new RaceCar();
		Car rc2 = new RaceCar();

		cars.add(car);
		cars.add(rc1);
		cars.add(rc2);

		racecars.add(car);
		racecars.add(rc1);
		racecars.add(rc2);

    // RaceCar rc4 = (RaceCar)new Car();
  }
}
