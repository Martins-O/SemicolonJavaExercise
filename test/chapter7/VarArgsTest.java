package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VarArgsTest {


    @Test
    public void testThatMethodCanFindAverageWithSeriesOfNumberGiven(){
        int[] seriesOfNumber = {1,2,3,43,4,55,22,3,45,67};
        int expected = 24;

        VarArgs var = new VarArgs();

        assertEquals(24, var.average(seriesOfNumber));
    }

}