package turtleGraphice;

public class Pen {

    private boolean isTurnRight;
    private boolean isPenUp;
    public boolean isPenUp() {

        return isPenUp;
    }



    public void penUp() {

        isPenUp = true;
    }
    public void penDown(){
        isPenUp = false;
    }

    public boolean isTurnRight() {
        return isTurnRight;
    }
    public void turnRight(){
        isTurnRight = true;
    }

    public void turnDown() {
        isTurnRight = false;
    }
}
