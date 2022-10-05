package chapter5;

public class CompoundInterest {
//    (Modified Compound-Interest Program) Modify the compound-interest application of
//    Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//    vary the interest rate.
public static void main(String[] args) {
    double principal = 1000.0; // initial amount before interest
     double rate = 0.05; // interest rate
    // display headers
    System.out.printf("%s %n", "Year", "Amount on deposit");

    for (int year = 1; year <= 10; ++year) {
        // calculate new amount on deposit for specified year
        double amount = principal * Math.pow(1.0 + rate, year);

        // display the year and the amount
        System.out.printf("%4d%,20.2f%n", year, amount);
    }
}
}
