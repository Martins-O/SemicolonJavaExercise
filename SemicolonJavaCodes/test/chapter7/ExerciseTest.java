package chapter7;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class ExerciseTest {
    private Exercise exercise;

    @BeforeEach
    public void alwaysSetup(){
        exercise = new Exercise();
    }

    @Test
    public void testThatCanArrayValueCanBeDisplay(){
        int[] myArray = {1,2,3,4,5,6,7,8,9,19};
        int result = myArray[3];
        assertEquals(result, exercise.displayValue(result));
    }
    @Test
    public void testThatArrayCanBeInitialize(){
        int[] my = {-1, -1, -1, -1, -1,-1,-1};
        assertTrue(exercise.arrayInitializer(my));
    }
}