/**
 * This method extends PayCalculator. It calculates an employee's hazard pay.
 *
 * @author Tyler Lynch, Brendan Clancy
 *
 * CS1122
 * Date last modified: 1/26/2022
 */
public class HazardPay extends PayCalculator {

    /**
     * constructor that instantiates a HazardPay object with a payRate parameter
     * @param payrate: rate of pay
     */
    public HazardPay(double payrate) {
        this.payRate = payrate;
    }

    /**
     * computes an employee's hazard pay
     *
     * @param hours: number of hours worked
     * @return: double value representing hazard pay, hazard pay = 1.5 * regular pay
     */
    @Override
    public double computePay(double hours) {
        return payRate * 1.5 * hours;
    }
}
