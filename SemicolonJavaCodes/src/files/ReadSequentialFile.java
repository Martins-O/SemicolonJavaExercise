//package files;
//
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//
//public class ReadSequentialFile {
//    public static void main(String[] args) {
//
//        try (BufferedWriter writer =
//                     Files.newBufferedWriter(Paths.get("Clients.xml"))){
//
//            Accounts accounts = JAXB.unmarshal(writer, Accounts.class);
//
//            System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
//                    "First name", "Last Name", "Balance");
//
//            for (Account account : accounts.getAccounts()) {
//                System.out.printf("%-10d%-12s%-12s%10.2f%n",
//                        account.getAccountNumber(), account.getFirstName(),
//                        account.getLastName(), account.getBalance());
//            }
//        }
//        catch (IOException ioException){
//            System.err.println("Error opening file.");
//        }
//    }
//}
