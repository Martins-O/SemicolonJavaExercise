package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheSumOfASeriesTest {
    private TheSumOfASeries theSumOfASeries;

    @BeforeEach
    public void atSetUp(){
        theSumOfASeries = new TheSumOfASeries();
    }

    @Test
    public void testThatAddSeriesOfNumbers(){
//        theSumOfASeries.addingOfSeriesNumber(4);
        assertEquals(8, theSumOfASeries.addingOfSeriesNumber(4));
    }

    @Test
    public void testThatMultiplySeriesOfNumbers(){
        assertEquals(16, theSumOfASeries.multiplyOfSeriesNumber(4));
    }
}