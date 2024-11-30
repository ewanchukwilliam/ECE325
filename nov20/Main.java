public class Main {
	public static long sum() {
		long sum = 0L;
		for (long i=0L; i <= Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return sum;
	}
	public static String buildString() {
		String str = "";
		for (int i=0; i < 100000; i++) {
			str += "a";
		}
		return str;
	}
	public static String buildstrBuilder() {
		StringBuilder str = new StringBuilder();
		for (int i=0; i < 100000; i++) {
			str.append("a");
		}
		return str.toString();
	}
	public static void main(String[] args) {
		// Create a new instance of the class
		// and call the method
		System.out.println("Hello World");
		long start = System.currentTimeMillis();
		buildString();
		long end = System.currentTimeMillis();
		buildstrBuilder();
		long end2 = System.currentTimeMillis();
		System.out.println("string taken: " + (end - start) + "ms");
		System.out.println("stringbuilder taken: " + (end2 - end) + "ms");


	}
}
