package chapter17.functional_Interface.function;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        Function<String, Integer> function =
                (name) -> name.length();
        System.out.println(function.apply("Martins"));
    }
}
