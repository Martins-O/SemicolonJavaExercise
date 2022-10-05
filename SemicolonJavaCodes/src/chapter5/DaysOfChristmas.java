package chapter5;

import java.util.Scanner;

public class DaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any day between 1 - 12:");
        int day = input.nextInt();


        if(day >= 1 && day <= 12) {
            switch (day) {
                case 12:
                    if (day == 12) {
                        System.out.println("On the twelfth day of Christmas, my true love sent to me\n" +
                                "Twelve drummers drumming\n" +
                                "Eleven pipers piping\n" +
                                "Ten lords a-leaping\n" +
                                "Nine ladies dancing\n" +
                                "Eight maids a-milking\n" +
                                "Seven swans a-swimming\n" +
                                "Six geese a-laying\n" +
                                "Five gold rings (five golden rings)\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 11:
                    if (day == 11) {
                        System.out.println("On the eleventh day of Christmas, my true love sent to me\n" +
                                "I sent eleven pipers piping\n" +
                                "Ten lords a-leaping\n" +
                                "Nine ladies dancing\n" +
                                "Eight maids a-milking\n" +
                                "Seven swans a-swimming\n" +
                                "Six geese a-laying\n" +
                                "Five gold rings (five golden rings)\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 10:
                    if (day == 10) {
                        System.out.println("On the tenth day of Christmas, my true love sent to me\n" +
                                "Ten lords a-leaping\n" +
                                "Nine ladies dancing\n" +
                                "Eight maids a-milking\n" +
                                "Seven swans a-swimming\n" +
                                "Six geese a-laying\n" +
                                "Five gold rings (five golden rings)\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 9:
                    if (day == 9) {
                        System.out.println("On the ninth day of Christmas, my true love sent to me\n" +
                                "Nine ladies dancing\n" +
                                "Eight maids a-milking\n" +
                                "Seven swans a-swimming\n" +
                                "Six geese a-laying\n" +
                                "Five gold rings (five golden rings)\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 8:
                    if (day == 8) {
                        System.out.println("On the eighth day of Christmas, my true love sent to me\n" +
                                "Eight maids a-milking\n" +
                                "Seven swans a-swimming\n" +
                                "Six geese a-laying\n" +
                                "Five gold rings (five golden rings)\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 7:
                    if (day == 7) {
                        System.out.println("On the seventh day of Christmas, my true love sent to me\n" +
                                "Seven swans a-swimming\n" +
                                "Six geese a-laying\n" +
                                "Five gold rings (five golden rings)\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 6:
                    if (day == 6) {
                        System.out.println("On the sixth day of Christmas, my true love sent to me\n" +
                                "Six geese a-laying\n" +
                                "Five gold rings (five golden rings)\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 5:
                    if (day == 5) {
                        System.out.println("On the fiftieth day of Christmas, my true love sent to me\n" +
                                "Five gold rings (five golden rings)\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 4:
                    if (day == 4) {
                        System.out.println("On the fourth day of Christmas, my true love sent to me\n" +
                                "Four calling birds\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 3:
                    if (day == 3) {
                        System.out.println("On the third day of Christmas, my true love sent to me\n" +
                                "Three French hens\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 2:
                    if (day == 2) {
                        System.out.println("On the second day of Christmas, my true love sent to me\n" +
                                "Two turtledoves\n" +
                                "And a partridge in a pear tree");
                        break;
                    }
                case 1:
                    if (day == 1) {
                        System.out.println("On the first day of Christmas, my true love sent to me\n" +
                                "A partridge in a pear tree");
                        break;
                    }
                default:
                    System.out.println("invalid day input");
            }
        }
            else
            System.out.println("enter values between 1 - 12");

    }
}
