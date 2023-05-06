package chapter5;

public class TheSumOfASeries {
    
    public long addingOfSeriesNumber(long number){
        long total = 0;
        for (long series = 1; series <=number; series++) {
            total = series + series;
        }
        return total;
    }

    public long multiplyOfSeriesNumber(long number) {
        long total = 0;
        for (long series = 1; series <= number; series++) {
            total = series * series;
        }
        return total;
    }


}
