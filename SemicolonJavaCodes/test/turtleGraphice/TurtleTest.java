package turtleGraphice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphice.Direction.*;


class TurtleTest {
    Turtle ijapa;

    @BeforeEach
    public void doThisBeforeEach(){
        ijapa = new Turtle();
    }

    @Test
    public void testThatTurtleClassExist(){
        assertNotNull(ijapa);
    }
    @Test
    public void turtleCanMovePenupTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }
    @Test
    void turtleCanMovePenDownTest(){
        ijapa.isPenDown();
        assertFalse(ijapa.isPenUp());
    }
    @Test
    void turtleCanTurnRightTest(){
        ijapa.turnRight();
        assertTrue(ijapa.isTurnRight());
    }
    @Test
    void turtleCanTurnDownTest(){
        ijapa.isTurnDown();
        assertFalse(ijapa.isTurnRight());
    }
    @Test
    public void turtleCanTurnRightTestWhileFacingEast(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.rightTurn();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightTestWhileFacingSouth(){
        ijapa.rightTurn();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.rightTurn();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightTestWhileFacingWest(){
        ijapa.rightTurn();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.rightTurn();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.rightTurn();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightTestWhileFacingNorth(){
        ijapa.rightTurn();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.rightTurn();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.rightTurn();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.rightTurn();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftTestWhileFacingEast(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftTestWhileFacingNorth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftTestWhileFacingSouth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftTestWhileFacingWest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.LeftTurn();
        assertEquals(EAST, ijapa.getCurrentDirection());


    }
//    @Test
//    void tets(){
//        getTurtle();
//    }
//    @Test
//    public void turtleCanMoveForwardWhilefacingeast(){
//        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
//        ijapa.move(5);
//        assertEquals(new Position(0,5), ijapa.getCurrentPosition());
//    }
}