package chapter17.streams;

import java.util.List;

public class ExampleNine {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers.stream()
                .reduce(1, Integer::sum));
    }
}
