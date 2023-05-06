package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void testThatPrimeNumber(){
        PrimeNumbers numbers = new PrimeNumbers();
        assertTrue(numbers.primeNum(7));
    }

}