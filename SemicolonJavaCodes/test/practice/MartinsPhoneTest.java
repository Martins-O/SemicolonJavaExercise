package practice;

import java.util.Scanner;
class MartinsPhoneTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MartinsPhone phone = new MartinsPhone();
        System.out.println("""
                Welcome to Martins Phone.
                We connect the World together.
                Press 1 to open menu:
                """);
        int option = input.nextInt();
        if (option == 1) {
            phone.mainMenu();
        }


    }

}