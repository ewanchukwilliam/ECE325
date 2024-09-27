public class RaceTrack {

  Car[] allCars = new Car[3];

  public RaceTrack(Car car1, Car car2, Car car3) {
    allCars[0] = car1;
    allCars[1] = car2;
    allCars[2] = car3;
  }
  public Car getSlowestCar() {
    int min = Integer.MAX_VALUE;
    int ind = -1;
    for (int i = 0; i < allCars.length; i++) {
      if (min > allCars[i].maxSpeed) {
        ind = i;
        min = allCars[i].maxSpeed;
      }
    }
    return allCars[ind];
  }
  public Car getFastestCar() {
    int max = -1;
    int ind = -1;
    for (int i = 0; i < allCars.length; i++) {
      if (max < allCars[i].maxSpeed) {
        ind = i;
        max = allCars[i].maxSpeed;
      }
    }
    return allCars[ind];
  }
}
