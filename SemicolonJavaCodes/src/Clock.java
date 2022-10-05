public class Clock {

    private int hour;
    private static int minutes;
    private static int seconds;

    public Clock(int hour, int minutes, int seconds) {
        if(hour >= 23){
            this.hour = hour;
        }
        if(minutes >= 59){
            this.minutes = minutes;
        }
        if(seconds >= 59 ){
            this.seconds = seconds;
        }
    }

    public void setHour(int hour) {
       this.hour = hour;
    }

    public int getHour() {
        if(hour > 23){
            hour = 00;
        }
        return hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public static int getMinutes() {
        if(minutes >= 59) {
            minutes = 00;
        }
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public static int getSeconds() {
        if(seconds >= 59) {
            seconds = 00;
        }
            return seconds;
    }
}