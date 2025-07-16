/**
 * This method extends PayCalculator. It calculates an employee's regular pay.
 *
 * @author Tyler Lynch, Brendan Clancy
 *
 * CS1122
 * Date last modified: 1/26/2022
 */
public class RegularPay extends PayCalculator {

    /**
     * constructor for RegularPay objects using a payRate parameter
     * @param payRate: rate of pay
     */
    public RegularPay(double payRate) {
        this.payRate = payRate;
    }
}
