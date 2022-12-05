package chapter17;

import java.util.stream.IntStream;

public class StreamMApReduce {

    public static void main(String[] args) {
        System.out.println("sum of the even ints from 4 through 40 is: "+
                IntStream.rangeClosed(1,10)
                        .map((m)->{return m * 4 ;})
                        .sum());


    }
}
