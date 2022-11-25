package chapter7.turtle;

import chapter7.turtle.enums.Cardinal;

public class Turtle {
    private int xCordinate;
    private int yCordinate;

    private Cardinal direction = Cardinal.EAST;

    private Pen biro;

    public Turtle() {}

    public Turtle(int x, int y) {
        xCordinate = x;
        yCordinate = y;
    }
    public Turtle(int x, int y, Cardinal direction) {
        this(x,y);
        this.direction = direction;
    }


    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }

    public Pen getBiro() {
        return biro;
    }

    public void setBiro(Pen biro) {
        this.biro = biro;
    }
}
