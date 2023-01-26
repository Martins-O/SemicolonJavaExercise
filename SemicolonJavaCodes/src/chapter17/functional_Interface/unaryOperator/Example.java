package chapter17.functional_Interface.unaryOperator;

import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator =
                (name) -> String.valueOf(name.length()).trim();
        System.out.println(unaryOperator.apply("Martins"));
    }
}
