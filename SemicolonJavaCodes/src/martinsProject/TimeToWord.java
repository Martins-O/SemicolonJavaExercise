package martinsProject;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Scanner;

public class TimeToWord {
        static void printWords(int h, int m) {
            String[] nums = { "zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine",
                    "ten", "eleven", "twelve", "thirteen",
                    "fourteen", "fifteen", "sixteen", "seventeen",
                    "eighteen", "nineteen", "twenty", "twenty one",
                    "twenty two", "twenty three", "twenty four",
                    "twenty five", "twenty six", "twenty seven",
                    "twenty eight", "twenty nine",
            };

            if (m == 0)
                System.out.println(nums[h] + " o' clock ");

            else if (m == 1)
                System.out.println("one minute past " +
                        nums[h]);

            else if (m == 59)
                System.out.println("one minute to " +
                        nums[(h % 12) + 1]);

            else if (m == 15)
                System.out.println("quarter past " + nums[h]);

            else if (m == 30)
                System.out.println("half past " + nums[h]);

            else if (m == 45)
                System.out.println("quarter to " +
                        nums[(h % 12) + 1]);

            else if (m <= 30)
                System.out.println( nums[m] + " minutes past " +
                        nums[h]);

            else System.out.println( nums[60 - m] + " minutes to " +
                    nums[(h % 12) + 1]);
        }


        public static void main(String []args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the time (hour : minutes) --> ");
            int h = input.nextInt(), m= input.nextInt();
            printWords(h, m);
            Formatter format;
            Calendar calender = Calendar.getInstance();
            format = new Formatter();
            format.format("%tl:%tM", calender,
                    calender);
            System.out.println(format);

        }
    }

