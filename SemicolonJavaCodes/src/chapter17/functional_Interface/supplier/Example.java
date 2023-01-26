package chapter17.functional_Interface.supplier;

import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 5;

        System.out.println(supplier.get());
    }
}
