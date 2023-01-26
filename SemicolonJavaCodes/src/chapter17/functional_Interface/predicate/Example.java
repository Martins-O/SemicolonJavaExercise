package chapter17.functional_Interface.predicate;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Predicate<String> predicate = (word) -> {
            return word.length() > 3;
        };
        System.out.println(predicate.test("Semicolon"));
    }
}
