package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TddReverseTest {

    @Test
    public void reverseArrayTest(){
        int[] array = {1,2,3,4,5};
        int[] reversedArray = TddReverse.reverse(array);
//        assertArrayEquals(new int[]{5,4,3,2,1}, reversedArray);
    }
    @Test
    public void reverseStringTest(){
        String input = "Adeleke";
        String output = TddReverse.reverse(input);
        assertEquals("ekeledA", output);
    }

}