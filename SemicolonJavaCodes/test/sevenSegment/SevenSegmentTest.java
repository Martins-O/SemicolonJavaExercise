package sevenSegment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentTest {

    @Test
    void testThatcanPrintThree(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setScreen(String.valueOf(11110011));
        sevenSegment.display();
    }
    @Test
    void testThatCanPrintFour(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setScreen(String.valueOf(11111101));
        sevenSegment.display();
    }

}