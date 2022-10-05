package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test

    void testObjectExists(){
        Calculators calculator = new Calculators();
        assertNotNull(calculator);
    }

    @Test

    void sum(){
        Calculators calculator = new Calculators();
        assertEquals(5, calculator.addTwoNumbers(2,3));
    }
}