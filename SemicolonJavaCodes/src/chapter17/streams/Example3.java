package chapter17.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(100, 101, 90, 5, 1, 109, 2, 8, 15);
        List<Integer> numbersList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbersList);
    }
}
