package turtleGraphice;

public class Position {
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Position(int row, int column) {
        this.column = column;
        this.row = row;
    }
    public String toString(){
        String toBeReturned = "";
        toBeReturned+= "row"+ row+ "\n";
        toBeReturned+= "column" + column + "\n";

        return toBeReturned;
    }
}
