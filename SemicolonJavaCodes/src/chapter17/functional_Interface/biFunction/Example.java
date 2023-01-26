package chapter17.functional_Interface.biFunction;

import java.util.function.BiFunction;

public class Example {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction =
                (word, number) -> word.length() == number;
        System.out.println(biFunction.apply("Martins", 34));
    }
}
