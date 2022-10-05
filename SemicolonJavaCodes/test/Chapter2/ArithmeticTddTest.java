package Chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
//        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
//        number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
class ArithmeticTddTest {
    ArithmeticTdd arithmeticTdd;

    @BeforeEach
    void dothisBeforeEachTest() {
    arithmeticTdd = new ArithmeticTdd();
}


//    @Test
//    void checkNotNull(){
//        arithmeticTdd(arithmeticTdd);
//    }

    @Test
    void testToGetSquareofTheNumber(){
        assertEquals(25, arithmeticTdd.getSquare(5));
        assertEquals(16, arithmeticTdd.getSquare(4));
    }

    @Test
    void testToSquareOfNumbers(){
        assertEquals(41, arithmeticTdd.squareOfnum(4,5));
    }

    @Test
    void testTheDifferenceOfSquare(){
        assertEquals( 9, arithmeticTdd.difference(5, 4));
    }

}