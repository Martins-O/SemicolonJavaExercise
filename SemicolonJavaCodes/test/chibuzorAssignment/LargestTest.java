package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestTest {

    @Test
    void testThatFindTwoLargestArrayAndAddIt(){
        int[] list = {12,33,67,34,12,100};
        int[] expected = {167};
        assertArrayEquals(expected, Largest.largestPairSum(list));
    }

}