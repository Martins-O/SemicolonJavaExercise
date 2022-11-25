package martinsProject;

import java.util.Scanner;

public class Ha {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            double d = scan.nextDouble();
            int i = scan.nextInt();
            scan.close();


            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
}
