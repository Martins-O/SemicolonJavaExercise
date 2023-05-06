package chapter17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.println("sum of 1 to 10 is "+
        IntStream.rangeClosed(1,10).summaryStatistics());
    }
}