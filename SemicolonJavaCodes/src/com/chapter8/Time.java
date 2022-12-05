package com.chapter8;

//todo (Enhancing Class Time2) Modify class Time2 of Fig. 8.5
//      to include a tick method that increments the time stored
//      in a Time2 object by one second. Provide method incrementMinute
//      to increment the minute by one and method incrementHour to
//      increment the hour by one. Write a program that tests the tick
//      method, the incrementMinute method and the incrementHour method
//      to ensure that they work correctly. Be sure to test the following cases:
//      a) incrementing into the next minute,
//      b) incrementing into the next hour and
//      c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){}

    public Time(int hour, int minute, int second) {
        validateKey(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        isValidateHour(hour);
        return hour;
    }

    public void setHour(int hour) {
        isValidateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        isValidateMinute(minute);
        return minute;
    }

    public void setMinute(int minute) {
        isValidateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        isValidateSecond(second);
        return second;
    }

    public void setSecond(int second) {
        isValidateSecond(second);
        this.second = second;
    }


    public Time(int hour){
        validateKey(hour,0,0);
    }

    public void validateKey(int hour, int minute, int second) {
        isValidateHour(hour);
        isValidateMinute(minute);
        isValidateSecond(second);
    }

    public void isValidateSecond(int second) {
        boolean isValidSecond = second > 59 || second < 0;
        if (isValidSecond) throw new IllegalArgumentException("Invalid second input!");

    }

    public void isValidateMinute(int minute) {
        boolean isValidMinute = minute > 59 || minute < 0;
        if (isValidMinute) throw new IllegalArgumentException("Invalid minute input!");

    }

    public void isValidateHour(int hour) {
        boolean isValidHour = hour > 23 || hour < 0;
        if (isValidHour) throw new IllegalArgumentException("Invalid hour input!");

    }

    public void incrementSeconds(){
        if (this.second < 59) {
            this.second++;
        }else {
            this.second = 0;
            incrementMinute();
        }
    }
    private void incrementMinute() {
        if (this.minute < 59) {
            this.minute++;
        }else {
            this.minute = 0;
            incrementHour();
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    private void incrementHour() {
        if (this.hour < 23 ) {
            this.hour++;
        }else{
            this.hour = 0;
        }
    }


}

