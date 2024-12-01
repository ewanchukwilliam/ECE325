package ece325.lab.assignment5;
public class Salary {
	
	/**
	 * Returns the amount of pay a band member will get (in dollars). This amount is
	 * computed by deducting the amount spent on snacks from the base salary, and
	 * then computing and adding the bonus (if any) over that amount. So, if a band
	 * member earned 100 dollars, spent 50 on snacks, and earned a bonus of 10 (%),
	 * their total pay will be 55 dollars.
	 * 
	 * Note: The current implementation of this method is extremely buggy and can
	 * easily be abused by anyone.
	 * 
	 * @param salary       The base salary earned by this band member during this
	 *                     salary period (in dollars).
	 * @param snacksAmount The total amount spent by this band member on snacks
	 *                     during this salary period (in dollars).
	 * @param bonus        The bonus percentage that the band member earned this
	 *                     salary period (in percentage).
	 * @return the amount of pay a band member will get (in dollars)
	 */


    public static Double pay(Double salary, Double snacksAmount, Integer bonus) {
        validateInputs(salary, snacksAmount, bonus);
        return calculateNetPay(salary, snacksAmount, bonus);
    }

    private static void validateInputs(Double salary, Double snacksAmount, Integer bonus) {
        // Null check
        if (salary == null || snacksAmount == null || bonus == null) {
            throw new NullPointerException("Parameters cannot be null: salary=" + salary + ", snacksAmount=" + snacksAmount + ", bonus=" + bonus);
        }

        // Type checking, already ensured by method signature

        // Check for negative values
        if (salary < 0 || snacksAmount < 0 || bonus < 0) {
            throw new IllegalArgumentException("Parameters cannot be negative: salary=" + salary + ", snacksAmount=" + snacksAmount + ", bonus=" + bonus);
        }

        // Maximum salary check
        if (salary > 1000) {
            throw new IllegalArgumentException("Salary cannot be greater than 1000: salary=" + salary);
        }

        // Snacks amount cannot be greater than salary
        if (snacksAmount > salary) {
            throw new IllegalArgumentException("Snacks amount cannot be greater than salary: snacksAmount=" + snacksAmount);
        }

        // Valid range for bonus
        if (bonus < 0 || bonus > 10) {
            throw new IllegalArgumentException("Bonus must be between 0 and 10, inclusive: bonus=" + bonus);
        }
    }
		private static void checkOutput(Double output){
			if( !(output instanceof Double) || output < 0 || output > 1100 || output == null){
        throw new IllegalStateException("Calculated pay is invalid: " + output);
			}
		}

    private static Double calculateNetPay(Double salary, Double snacksAmount, Integer bonus) {
        // Calculate net pay
        Double netSalary = salary - snacksAmount;
        if (netSalary <= 0) {
            return 0.0;
        }
				Double takehome = netSalary + (netSalary * bonus / 100);
				checkOutput(takehome);
        return takehome;
    }
}

