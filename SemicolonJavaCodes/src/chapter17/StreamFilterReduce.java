package chapter17;

import java.util.stream.IntStream;

public class StreamFilterReduce {
    public static void main(String[] args) {
        System.out.println(new StringBuilder().append("Sum of the triples of the even ints from 2 through 10 is: ").append(IntStream.rangeClosed(1, 10)
                .filter(m -> m % 2 == 0)
                .map(m -> m * 3)
                .sum()).toString());
    }
}
