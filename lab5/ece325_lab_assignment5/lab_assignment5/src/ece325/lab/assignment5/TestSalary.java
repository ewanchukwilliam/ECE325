package ece325.lab.assignment5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestSalary {

    @ParameterizedTest(name = "Base Salary: {0}, Snacks: {1}, Bonus: {2} -> Expected: {3}")

        @CsvSource({
          "100.0, 50.0, 10, 55.0",
          "1000.0, 0.0, 10, 1100.0",
          "100.0, 50.0, 0, 50.0",
          "100.0, 100.0, 0, 0.0",
          "10.0, 0.0, 10, 11.0",
          "150.0, 0.0, 10, 165.0",
          "500.0, 100.0, 10, 440.0",
          "1000.0, 500.0, 10, 550.0",
          "800.0, 300.0, 0, 500.0",
          "600.0, 0.0, 5, 630.0",
          "400.0, 400.0, 0, 0.0"
        })
    public void testSalaryPayment(double salary, double snacks, int bonus, double expected) {
        assertEquals(expected, Salary.pay(salary, snacks, bonus), 0.001);
    }

    @ParameterizedTest(name = "Invalid Salary: {0}")
    @ValueSource(doubles = {-100.0, 1050.0})
    public void testInvalidSalary(double salary) {
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(salary, 50.0, 5);
        }, "Base salary cannot be negative or exceed $1,000");
    }

    @ParameterizedTest(name = "Invalid Snacks: {1}")
    @ValueSource(doubles = {-50.0, 150.0})
    public void testInvalidSnackSpend(double snacks) {
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(100.0, snacks, 5);
        }, "Snacks amount cannot be negative or exceed salary");
    }

    @ParameterizedTest(name = "Invalid Bonus: {2}")
    @ValueSource(ints = {-5, 15})
    public void testInvalidBonus(int bonus) {
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(100.0, 50.0, bonus);
        }, "Bonus cannot be negative or greater than 10%");
    }

    @Test
    public void testMaximumSnackSpend() {
        assertEquals(0.0, Salary.pay(1000.0, 1000.0, 0), 0.001);
    }

    @ParameterizedTest
    @CsvSource({
        "0.0, 0.0, 0, 0.0",
        "0.01, 0.0, 0, 0.01"
    })
    public void testMinimumSalaryAndBoundaryCases(double salary, double snacks, int bonus, double expected) {
        assertEquals(expected, Salary.pay(salary, snacks, bonus), 0.001);
    }

    @Test
    public void testNullValueHandling() {
        assertThrows(NullPointerException.class, () -> {
            Salary.pay(null, 50.0, 5);
        }, "Salary cannot be null");
        
        assertThrows(NullPointerException.class, () -> {
            Salary.pay(100.0, null, 5);
        }, "Snacks amount cannot be null");

        assertThrows(NullPointerException.class, () -> {
            Salary.pay(100.0, 50.0, null);
        }, "Bonus cannot be null");
    }

    @ParameterizedTest
    @CsvSource({
        "'abc', '50.0', '5'",   // Invalid salary as string
        "'100.0', 'xyz', '5'",  // Invalid snacks as string
        "'100.0', '50.0', 'l'"  // Invalid bonus as string
    })
    public void testInvalidDataTypes(String salary, String snacks, String bonus) {
        assertThrows(NumberFormatException.class, () -> {
            Double parsedSalary = Double.parseDouble(salary);
            Double parsedSnacks = Double.parseDouble(snacks);
            Integer parsedBonus = Integer.parseInt(bonus);
            Salary.pay(parsedSalary, parsedSnacks, parsedBonus);
        });
    }
}
