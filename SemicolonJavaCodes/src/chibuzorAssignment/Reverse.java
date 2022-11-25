package chibuzorAssignment;

import java.util.Scanner;

class Main {
    public static String reverse(String str) {
        if (str == null || str.equals("")) {
            return str;
        }

        int n = str.length();

        char[] temp = new char[n];


        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }

        return String.copyValueOf(temp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String re = input.nextLine();

        re = reverse(re);

        System.out.println("The reversed string is " + re);
    }
}