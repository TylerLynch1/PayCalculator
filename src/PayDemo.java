/**
 * This class is used to test RegularPay and HazardPay objects
 *
 *  @author Tyler Lynch, Brendan Clancy
 *
 * CS1122
 * Date last modified: 1/26/2022
 */
public class PayDemo {
    public static void main(String[] args) {
        RegularPay pay1 = new RegularPay(25);                       // Regular pay object with $25.00/hr argument
        HazardPay pay2 = new HazardPay(25);                         // Hazard pay object with $25.00/hr argument
        System.out.println("Regular pay: " + pay1.computePay(40));   // Prints RegularPay
        System.out.println("Hazard pay: " +pay2.computePay(40));     // prints HazardPay
    }
}
