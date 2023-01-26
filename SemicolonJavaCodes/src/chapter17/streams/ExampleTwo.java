package chapter17.streams;

import java.util.Random;
import java.util.stream.Stream;

public class ExampleTwo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        stream.forEach(System.out::println);

        Stream<Integer> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

        Stream<Integer> nums = Stream.generate(() -> new Random().nextInt(10));
        nums.forEach(System.out::println);
    }
}
