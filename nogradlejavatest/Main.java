

public class Main {
	public String getgreeting() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		System.out.println(new Main().getgreeting());
		Racecar thisisCar = new Racecar();
		thisisCar.speedCar();
		thisisCar.setspeed(200);
		thisisCar.speedCar();
	}
}
