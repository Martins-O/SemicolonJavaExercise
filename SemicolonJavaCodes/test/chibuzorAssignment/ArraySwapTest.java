package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySwapTest {

    @Test
    void testThatSwapElementInArray(){
        ArraySwap arraySwap = new ArraySwap();
        int[] list = {1,2};
        int[] expected = new int[]{2, 1};
        assertArrayEquals(expected, ArraySwap.swap(list));
    }

}