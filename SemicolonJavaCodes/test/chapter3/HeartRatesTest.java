package chapter3;

import java.util.Scanner;

class HeartRatesTest {
    public static void main(String[] args) {
        Scanner martinsHealthCentre = new Scanner(System.in);

        System.out.println("Enter LastName: ");
        String lastName = martinsHealthCentre.nextLine();

        System.out.println("Enter FirstName: ");
        String firstName = martinsHealthCentre.nextLine();

        System.out.println("Enter your date of birth YYYY/MM/DD: ");
        String doB = martinsHealthCentre.nextLine();
    }

}