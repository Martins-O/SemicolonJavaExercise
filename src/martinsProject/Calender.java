package martinsProject;

public class Calender {
    int year;
    String[] month = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
    String [] day = {"SUN", "MON", "TUE", "WED", "THUR", "FRI", "SAT"};
    int[] count = {31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    void validatingLeap(){
        if(year % 4 == 0 && year % 100 == 0 || year % 100 == 0){
            count[2] = 29;
        }else count[3] = 28;
    }
}
