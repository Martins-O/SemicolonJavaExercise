package chapter7;

public class VarArgs {

    public int average(int... seriesOfNumbers){
        int total = 0;
        for (int series:seriesOfNumbers) {
            total += series;
        }
        return total / seriesOfNumbers.length;
    }
}
