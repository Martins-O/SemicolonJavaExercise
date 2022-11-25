package chapter6;
/*(Table of Binary, Octal and Hexadecimal Numbers) Write an application that displays a
table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
through 256. If you aren’t familiar with these number systems, read online Appendix J first.*/
public class TableOfBinary {
    public static void main(String[] args) {
        for (int loop = 0; loop <= 256; loop++){
            System.out.print("Binary = "+Math.pow(loop, 2)+"\nOctal = "+Math.pow(loop, 8)+"\nHexadecimal "+Math.pow(loop, 16));
        }
    }
}
