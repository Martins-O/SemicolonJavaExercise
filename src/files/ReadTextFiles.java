package files;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFiles {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("Clients.txt"))){
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                    "First Name", "Last Name", "Balance");
            while (scanner.hasNext()) {
                System.out.printf("%-10d%-12s%-12s%10.2f%n", scanner.nextInt(),
                        scanner.next(), scanner.next(), scanner.nextDouble());
            }
        }
        catch (IOException | NoSuchElementException |
        IllegalStateException e){
            e.printStackTrace();
        }
    }
}
