package practiceAll;

public class Date {

    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

class SimpleTime {
    private int hour;
    private int minute;
    private int second;

    public SimpleTime(int hour, int minute, int second) {
        validatekey(hour,minute,second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void validatekey(int hour, int minute, int second) {
        isValidateHour(hour);
        isValidateMinute(minute);
        isValidateSecond(second);
    }

    public String buildString() {
        return String.format("%24s: %s%n%24s: %s",
                "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }
    public void isValidateSecond(int second) {
        boolean isValidSecond = second > 59 || second < 0;
        if (isValidSecond) throw new IllegalArgumentException("Invalid second input!");

    }
    public void isValidateHour(int hour) {
        boolean isValidHour = hour > 23 || hour < 0;
        if (isValidHour) throw new IllegalArgumentException("Invalid hour input!");

    }
    public void isValidateMinute(int minute) {
        boolean isValidMinute = minute > 59 || minute < 0;
        if (isValidMinute) throw new IllegalArgumentException("Invalid minute input!");

    }

    public String toUniversalString() {

        return String.format("%02d:%02d:%02d",
                this.hour, this.minute, this.second);
    }

}
