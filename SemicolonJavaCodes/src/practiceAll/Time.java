package practiceAll;

public class Time {
    private int hour;
    private int minute;
    private int second;

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



    public Time(int hour, int minute, int second) {
        validateKey(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
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
}
