package chapter5;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AutoPolicyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutoPolicy autoPolicy = new AutoPolicy(1234, "Lexus", "CT");
        AutoPolicy autoPolicy1 = new AutoPolicy(1234, "Mezedecez Benz", "NJ");

        System.out.println("Enter Account Number: ");
        int acountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter model: ");
        String makeAndModel = scanner.nextLine();
        System.out.println("Enter State: "+AutoPolicy.isNoFaultState());
        String state = scanner.nextLine();

        System.out.println("Enter Account Number: ");
        acountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter model: ");
        makeAndModel = scanner.nextLine();
        System.out.println("Enter State: "+AutoPolicy.isNoFaultState());
        state = scanner.nextLine();

//         policyInNoFaultState(autoPolicy);
//        policyInNoFaultState(autoPolicy1);
//        }
//
//
//        public static void policyInNoFaultState(AutoPolicy policy) {
//        System.out.println("The auto policy:");
//        System.out.printf(
//                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
//                policy.getAccountNumber(), policy.getMakeAndModel(),
//                policy.getState(),
//                (policy.isNoFaultState() ? "is": "is not"));
    }

}