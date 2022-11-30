package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedTest {

    @Test
    public void testThatCanFindAbsolute(){
        Enhanced enhanced = new Enhanced();
        int[] num = {23,4,22,3};
        int expected = enhanced.statement(num);
        assertEquals(expected, enhanced.statement(num));
    }

}