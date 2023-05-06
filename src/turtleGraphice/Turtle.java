package turtleGraphice;



import static turtleGraphice.Direction.*;
//import static turtleGraphice.Position.*;

public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection;
//    private Position currentPosition;

    public Turtle(Pen pen, Direction currentDirection) {
        this.pen = pen;
        this.currentDirection = currentDirection;
//        currentPosition =  new Position(0,0);
    }


    public Turtle(){
        pen = new Pen();
        currentDirection = EAST;
    }
    public boolean isPenUp(){
        return pen.isPenUp();
    }

    public void penUp() {
        pen.penUp();
    }

    public void isPenDown() {
        pen.penDown();
    }

    public void turnRight() {
        pen.turnRight();
    }
    public boolean isTurnRight(){
        return pen.isTurnRight();
    }

    public void isTurnDown() {
        pen.turnDown();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void rightTurn() {
        switch (currentDirection){
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
//        if (currentDirection == EAST) currentDirection = SOUTH;
//        if (currentDirection == SOUTH) currentDirection = WEST;
    }
    public void LeftTurn(){
        switch (currentDirection){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case SOUTH -> face(EAST);
            case WEST -> face(SOUTH);
        }
    }
    private void face(Direction direction){
        currentDirection = direction;
    }

//    public void move(int i) {
//        switch (currentDirection){
//            case EAST -> {currentPosition.setColumn(currentPosition.getColumn()+numberOfSteps);
//            }
//        }
//    }

//    public Position getCurrentPosition() {
//        return null;
//    }
}
