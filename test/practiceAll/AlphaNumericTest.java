package practiceAll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphaNumericTest {

    private static AlphaNumeric numeric;

    @BeforeAll
    static void atSetUp(){
        numeric = new AlphaNumeric();
    }

    @Test
    void testThatCanBringCountTheNumericInAnString(){
        String numb = "g12g3h3k2g2";
        assertEquals(6, numeric.totalNumbers(numb));
    }

}