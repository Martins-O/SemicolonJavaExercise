//import javafx.scene.paint.Color;
//import javafx.scene.shape.Line;
//
//public class Turtle {
//	// Constants for the turtle's starting position and heading
//	private static final double START_X = 0;
//	private static final double START_Y = 0;
//	private static final double START_HEADING = 0;
//
//	// Properties of the turtle
//	private double x;
//	private double y;
//	private double heading;
//	private Color penColor;
//	private double penSize;
//	private boolean penDown;
//	private Line path;
//
//	// Constructor for the turtle
//	public Turtle() {
//		x = START_X;
//		y = START_Y;
//		heading = START_HEADING;
//		penColor = Color.BLACK;
//		penSize = 1;
//		penDown = true;
//		path = new Line();
//	}
//
//	// Getters and setters for the turtle's properties
//	public double getX() { return x; }
//	public void setX(double x) { this.x = x; }
//	public double getY() { return y; }
//	public void setY(double y) { this.y = y; }
//	public double getHeading() { return heading; }
//	public void setHeading(double heading) { this.heading = heading; }
//	public Color getPenColor() { return penColor; }
//	public void setPenColor(Color penColor) { this.penColor = penColor; }
//	public double getPenSize() { return penSize; }
//	public void setPenSize(double penSize) { this.penSize = penSize; }
//	public Line getPath() { return path; }
////
//	// Methods for moving the turtle
//	public void penUp() { penDown = false; }
//	public void penDown() { penDown = true; }
//	public void moveForward(double distance) {
//		// Calculate the new position of the turtle
//		double radians = Math.toRadians(heading);
//		double dx = distance * Math.cos(radians);
//		double dy = distance * Math.sin(radians);
//		double newX = x + dx;
//		double newY = y + dy;
//
//		// Draw a line if the pen is down
//		if (penDown) {
//			path.setStartX(x);
//			path.setStartY(y);
//			path.setEndX(newX);
//			path.setEndY(newY);
//			path.setStroke(penColor);
//			path.setStrokeWidth(penSize);
//		}
//
//		// Update the turtle's position
//		x = newX;
//		y = newY;
//	}
//	public void turnRight(double angle) { heading += angle; }
//	public void turnLeft(double angle) { heading -= angle; }
//	public void moveTo(double x, double y) {
//		// Save the current position and heading
//		double oldX = this.x;
//		double oldY = this.y;
//		double oldHeading = heading;
//
//		// Set the turtle's new position and heading
//		this.x = x;
//		this.y = y;
//		heading = Math.
