package com.chapter8;

//todo (Enhancing Class Date) Modify class Date of Fig. 8.7 to perform error checking on the
//        initializer values for variables month, day and year (currently it validates only
//        the month and day). Provide a method nextDay to increment the day by one. Write a
//        program that tests method nextDay in a loop that prints the date during each
//        iteration to illustrate that the method works correctly. Test the following cases:
//        a) incrementing into the next month and
//        b) incrementing into the next year.

public class DateCh8 {
        private int month;
        private int day;
        private int year;
        private static final int[] daysPerMonth =
                {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        public DateCh8(int month, int day, int year) {
            isValidating(month, day, year);
            this.month = month;
            this.day = day;
            this.year = year;
        }

    private static void isValidating(int month, int day, int year) {
        validatingYear(month);
        validatingMonth(month, day);
        validatingLeapYear(month, day, year);
    }

    private static void validatingYear(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");
        }
    }

    private static void validatingLeapYear(int month, int day, int year) {
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        }
    }

    private static void validatingMonth(int month, int day) {
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        }
    }


    public String toString() {
            return String.format("%d/%d/%d", month, day, year);
    }

    public void incrementMonth(int day){

    }
}
