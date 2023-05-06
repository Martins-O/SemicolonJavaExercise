package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsMultiplyTest {

    @Test
    void testThatCanMultoly(){
        IsMultiply multiply = new IsMultiply();
        multiply.isMultiply(23,45);
        assertTrue(multiply.isMultiply(23,45));
    }

}