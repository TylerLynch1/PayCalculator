/**
 * This method calculates regular pay and hazard pay for a given number of hours
 *
 * @author Tyler Lynch, Brendan Clancy
 *
 * CS1122
 * Date last modified: 1/26/2022
 */
public abstract class PayCalculator {

    double payRate; // rate of pay

    /**
     * This method computes a workers pay
     * @param hours: number of hours worked
     * @return: double value representing pay
     */
    public double computePay(double hours) {
        return payRate * hours;
    }
}
