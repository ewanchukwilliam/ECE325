import java.util.ArrayList;

public class ExceptionExample {
	ArrayList<String> myList;
	public void problemCode(String item) {
		myList.add(item);
	}
	public void betterCode(String item) {
		try {
			myList.add(item);
		} catch (NullPointerException e) {
			System.out.println("We found an error");
		}finally{
		}
	}
	public static void main(String[] args) {
		ExceptionExample example = new ExceptionExample();
		example.betterCode("hello");
		example.betterCode("world");
	}
}
