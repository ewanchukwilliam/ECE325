public class Car {
	private String name = "null";
	public String getName() {
		return this.name;
	}
	public void setName(String word) {
		 this.name = word;
	}

	public void carthing() {
		System.out.println(getName() + " goes Vroom Vroom");
	}
}
