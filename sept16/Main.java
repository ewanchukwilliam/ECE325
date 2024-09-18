public class Main {
  public void lesson1() {
    int[] speeds = new int[3];
    int[] speedsLarge = new int[300];
    System.out.println(speeds.length);
    speeds = speedsLarge;
    System.out.println(speeds.length);
  }
  public void lesson2() {
    Car newcar = new Car();
    newcar.carthing();
    newcar.setName("Micheal");
    newcar.carthing();
  }
  public void lesson3() {
    int[] arr1 = new int[10];
    System.out.println("array 1: ");
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = i * 10;
      System.out.println(arr1[i]);
    }

    System.out.println("array 2: ");
    int[] arr2 = new int[arr1.length];
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = arr1[i];
      System.out.println(arr2[i]);
    }

    System.out.println("array 3: ");
    int[] arr3 = arr2.clone();
    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }
  }
  public void printarr(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
  public void lesson4() {
    int[] speeds = {100, 200, 300};
    System.out.println("array 1");
    printarr(speeds);
    // multiple(speeds, 2);
    // System.out.println("array 2x arr");
    // printarr(speeds);
		int[] speeds2x = copymultiple(speeds, 2);
    System.out.println("array copy 2x");
		printarr(speeds2x);
    System.out.println("copy proof array 1");
		printarr(speeds);

  }
  public void multiple(int[] arr, int mult) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= mult;
    }
  }
  public int[] copymultiple(int[] arr, int mult) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i] * mult;
    }
    return newArr;
  }
  public static void main(String[] args) {
    Main thisMain = new Main();
    // thisMain.lesson1();
    // thisMain.lesson2();
    // thisMain.lesson3();
    thisMain.lesson4();
  }
}
