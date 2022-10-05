import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        String citizensName;
        double earningInYear;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the citizen name: ");
        citizensName = input.nextLine();
        System.out.println("Enter Earning per year: ");
        earningInYear = input.nextDouble();

        double totalTax;
        if(earningInYear <= 30_000){
            totalTax =1.0* 15/100 * earningInYear;
//             totalTax = 0.5 * earningInYear;
        }
        else {
            totalTax = 1.0 * 20 / 100 * earningInYear;
//            totalTax =  0.2 * earningInYear;
        }
        System.out.printf("Total tax for %s is %.2f%n", citizensName, totalTax);
    }
}
