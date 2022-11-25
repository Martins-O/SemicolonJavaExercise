package chapter7.turtle;

import org.junit.jupiter.api.BeforeEach;

class TurtleTest {

    private Turtle ijapa;

    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
        Pen pen = new Pen();
        ijapa.setBiro(pen);
    }

//    @Test
//    public void changePenPosition(){
//        assertEquals(PenPosition.DOWN, ijapa.getBiro().getDirection());
//    }

}