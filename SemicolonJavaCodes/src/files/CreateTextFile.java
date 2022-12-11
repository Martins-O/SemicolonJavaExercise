package files;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) {
        try(Formatter output = new Formatter("Clients.txt")){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator to end input.");
            while (scanner.hasNext()) {
                try {
                    output.format("%d %s %s %.2f%n", scanner.nextInt(),
                            scanner.next(), scanner.next(), scanner.nextDouble());
                }catch (NoSuchElementException elementException){
                    System.err.println("Invalid scanner. please try again.");
                    scanner.nextLine();
                }
                System.out.print("? ");
            }
        }
        catch (SecurityException | FileNotFoundException |
               FormatterClosedException e){
            e.printStackTrace();
        }
    }
}
