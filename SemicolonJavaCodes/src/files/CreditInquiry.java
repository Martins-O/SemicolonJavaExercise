package files;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        MenuOption accountType = getRequest(input);

        while (accountType != MenuOption.END){
            switch (accountType) {
                case ZERO_BALANCE -> System.out.printf("%nAccounts with zero balances%n");
                case CREDIT_BALANCE -> System.out.printf("%nAccounts with credit balances%n");
                case DEBIT_BALANCE -> System.out.printf("Accounts with debit balances%n");
            }
            readRecords(accountType);
            accountType = getRequest(input);
        }

    }

    private static void readRecords(MenuOption accountType) {
        try (Scanner scanner = new Scanner(Paths.get("Clients.txt"))){
            while (scanner.hasNext()){
                int accountNumber = scanner.nextInt();
                String firstName = scanner.next();
                String lastName = scanner.next();
                double balance = scanner.nextDouble();

                if (shouldDisplay(accountType, balance)){
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName,
                            lastName, balance);
                }
                else {
                    scanner.nextLine();
                }
            }
        }
        catch (NoSuchElementException | IllegalStateException |
               IOException noSuchElementException){
            System.err.println("Error processing file. Terminating...");
            System.exit(1);
        }
    }

    private static MenuOption getRequest(Scanner input) {
        int request = 4;
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                "1 = List account with zero balances",
                "2 = List account with credit balances",
                "3 = List account with debit balances",
                "4 = Terminate program");

        try {
            do {
                System.out.printf("%n?");
                request = input.nextInt();
            }while ((request < 1) || (request > 4));
        }catch (NoSuchElementException noSuchElementException){
            System.err.println("Invalid input. Terminating.");
        }
        return choices[request - 1];
    }

    private static boolean shouldDisplay(MenuOption option, double balance){
        if ((option == MenuOption.CREDIT_BALANCE) && (balance < 0)){
            return true;
        }
        else if ((option == MenuOption.DEBIT_BALANCE) && (balance > 0)){
            return true;
        }
        else if((option == MenuOption.ZERO_BALANCE) && (balance == 0)){
            return true;
        }
        return false;
    }
}