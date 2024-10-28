
// package IOtesting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void writeFile() {
    String file = "example2.txt";
    try (BufferedWriter writeme = new BufferedWriter(new FileWriter(file))) {
      writeme.write("Hello world!");
    } catch (IOException e) {
      System.out.println("An unknown error has occurred:");
      e.printStackTrace();
    }
  }
  public static void writeFileInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter text to write to the file:");
    String userInput = scanner.nextLine();
    String File = "example1.txt";
    try (BufferedWriter writeme =
             new BufferedWriter(new FileWriter(File, true))) {
      writeme.write("\n" + userInput);
    } catch (IOException e) {
      e.printStackTrace();

    } finally {
      scanner.close();
    }
  }
  public static void exampleStreamInput() {
    Scanner s = null;
    try {
      s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      System.out.println("Enter name, age:");
      String name = s.nextLine();
      int age = s.nextInt();
      System.out.println("Name: " + name + ", age: " + age);
    } finally {
      if (s != null)
        s.close();
    }
  }
  public static void main(String[] args) {
    // Main.writeFile();
    // Main.writeFileInput();
		Main.exampleStreamInput();
  }
}
