package chapter17.functional_Interface.biPredicate;

import java.util.function.BiPredicate;

public class Example {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate =
                (word, number) -> word.length() >3;
    }
}
