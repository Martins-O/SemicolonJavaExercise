package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CIATest {
    CIA cia;

    @BeforeEach
    void setup(){
        cia = new CIA();
    }

    @Test
    void testThatClassExist(){
        assertNotNull(cia);
    }

    @Test
    void testThatItCanMultiplyTwoNUmber(){
        assertEquals(4,CIA.repeat(2,2));
    }

}