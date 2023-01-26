package chapter17.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleFour {
    public static void main(String[] args) {
        List<Integer> numbers =
                List.of(100, 101, 90, 5, 1, 109, 2, 8, 15, -1, 0, 99, 98, 100, 101);
        System.out.println(numbers
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList()));
    }
}
