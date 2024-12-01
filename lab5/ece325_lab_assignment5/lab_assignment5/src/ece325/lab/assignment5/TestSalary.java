package ece325.lab.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class TestSalary {
	

    @Test
    public void testNormalSalaryPayment() {
        assertEquals(55.0, Salary.pay(100.0, 50.0, 10), 0.001);
    }

    @Test
    public void testMaximumSalaryPayment() {
        assertEquals(990.0, Salary.pay(1000.0, 0.0, 10), 0.001);
    }

    @Test
    public void testNoBonus() {
        assertEquals(50.0, Salary.pay(100.0, 50.0, 0), 0.001);
    }

    @Test
    public void testExactSalarySpentOnSnacks() {
        assertEquals(0.0, Salary.pay(100.0, 100.0, 0), 0.001);
    }

    @Test
    public void testInvalidBonus() {
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(100.0, 50.0, 15);
        }, "Bonus cannot be greater than 10%");
    }

    @Test
    public void testInvalidSnackSpend() {
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(100.0, 150.0, 5);
        }, "Cannot spend more on snacks than the base salary");
    }

    @Test
    public void testInvalidSalary() {
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(1050.0, 50.0, 5);
        }, "Base salary cannot exceed $1,000");
    }
}


