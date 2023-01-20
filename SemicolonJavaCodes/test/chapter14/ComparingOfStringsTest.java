package chapter14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingOfStringsTest {
    private ComparingOfStrings strings;

    @BeforeEach
    public void setUp(){
        strings = new ComparingOfStrings();
    }

    @Test
    public void testThatCanCompareWithoutCase(){
        String word1 = "Martins";
        String word2 = "Oluwaseun";
        int start = word2.length();
        int end = word2.length();
        String expected = strings.compareTwoStrings(word1, word2, start, end);
        assertEquals(expected, strings.compareTwoStrings(word1, word2, start, end));
    }
}