package chibuzorAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodTest {
    ArrayMethod arrayMethod;

    @BeforeEach
    void setUp(){
        arrayMethod = new ArrayMethod();
    }
    @Test
    void testThatTheClassExist(){
        assertNotNull(arrayMethod);
    }
    @Test
    void testThatArrayCanAdd(){
        assertEquals(10,ArrayMethod.addingOfArray());
    }
    @Test
    void testThatFindArrayMax(){
        assertEquals(4,ArrayMethod.findingMax());
    }
    @Test
    void testThatFindArrayMin(){
        assertEquals(1,ArrayMethod.findingMin());
    }

}