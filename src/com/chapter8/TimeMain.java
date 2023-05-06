package com.chapter8;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(6, 34,34);
        time.incrementSeconds();
        time.incrementMinute();
        time.incrementHour();
        System.out.println(time);
    }
}
