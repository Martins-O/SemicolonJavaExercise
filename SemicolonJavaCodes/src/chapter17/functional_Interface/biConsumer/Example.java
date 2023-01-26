package chapter17.functional_Interface.biConsumer;

import java.util.function.BiConsumer;

public class Example {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer =
                (name, age) -> {
                    System.out.println(name+ " " +age+" years old");
                };
        biConsumer.accept("Martins", 25);
    }
}
