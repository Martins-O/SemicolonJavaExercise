package chapter17.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleFive {
    public static void main(String[] args) {
        List<Integer> nums = List.of(100, 101, 90, 5, 1, 109, 2, 8, 15);
        System.out.println("Before:: "+ nums);
        System.out.println("After:: "+ nums.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList()));

    }
}
