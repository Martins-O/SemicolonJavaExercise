package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandLIneTest {

    private CommandLIne commandLIne;

    @BeforeEach
    public void atSetUp(){
        commandLIne = new CommandLIne();
    }

    @Test
    public void testForAverage(){
        int[] seriesOfNumber = {1,2,3,43,4,55,22,3,45,67};
        int expected = 24;
        assertEquals(24,commandLIne.average(seriesOfNumber));
    }

    @Test
    public void testForMaximum(){
        int[] seriesOfNumber = {1,2,3,43,4,55,22,3,45,67};
        int expected = 67;
        assertEquals(expected, commandLIne.maximum(seriesOfNumber));
    }

    @Test
    public void testForManimum(){
        int[] seriesOfNumber = {1,2,3,43,4,55,22,3,45,67};
        int expected = 1;
        assertEquals(expected, commandLIne.manimum(seriesOfNumber));
    }

}