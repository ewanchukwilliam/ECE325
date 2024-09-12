/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradletest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
  }
  @Test
  void appBigNumber() {
    App classUnderTest = new App();
    assertNotNull(classUnderTest.giveMeNumber(),
                  "app should have a big number");
    if (classUnderTest.giveMeNumber() > 2) {
      System.out.println("The number is plenty big enough! " + classUnderTest.giveMeNumber());
    }
  }
}
