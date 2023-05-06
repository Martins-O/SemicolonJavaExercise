package chapter10.shapeHierarchy;

public abstract class TwoDimensional extends Shape{

	private double area;

	public double getArea() {
		return area;
	}

	public abstract double calculateArea();
}
