
public class Racecar {
	private int speed;
	public Racecar() {
		this.speed = 100;
	}
	public Racecar(int customSpeed) {
		this.speed = customSpeed;
	}
	public void speedCar() {
		System.out.println("this is the cars speed: " + this.speed + "km/h");
	}
	public int getspeed() {
		return speed; 
	}
	public void setspeed(int newSpeed) {
		this.speed= newSpeed;
	}

}
