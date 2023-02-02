package chapter17.streams;

import com.chapter9.codeSnippet.Fruit;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleEight {
    public static void main(String[] args) {
        //using map
        Function<Integer, Fruit> function = (number) -> new Fruit("Orange","circle", number, "yellow");
        Integer[] number = {10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println(Arrays.stream(number)
                .map(function)
                .collect(Collectors.toList()));

        //using map to object

        int[] numbers = {10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println(Arrays.stream(numbers)
                .mapToObj(ExampleEight::buildPerson)
                .collect(Collectors.toList()));
    }

    @NotNull
    @Contract(pure = true)
    private static Fruit buildPerson(int number) {
        Fruit person = new Fruit("Orange","circle", number, "yellow");
        return person;
    }
}
