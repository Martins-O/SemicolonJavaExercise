package chapter10.shapeHierarchy;

public class Triangle extends TwoDimensional{

	private double base;
	private double height;

	public Triangle(){
		setBase(0.0);
		setHeight(0.0);
	}

	public Triangle(double base, double height) {
		setBase(base);
		setHeight(height);
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	@Override
	public double calculateArea() {
		return (getBase() * getHeight()) /2;
	}

	@Override
	public String toString() {
		return String.format("%sRadius: %.2f\n", super.toString(), getBase(), getHeight());
	}
}
