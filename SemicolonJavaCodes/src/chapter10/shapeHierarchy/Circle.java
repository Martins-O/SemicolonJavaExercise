package chapter10.shapeHierarchy;

public class Circle extends TwoDimensional{

	private double radius;

	public Circle(){
		setRadius(0.0);
	}

	public Circle(double radius){
		setRadius(radius);
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * (Math.pow(radius, 2));
	}

	@Override
	public String toString() {
		return String.format("%sRadius: %.2f\n", super.toString(), getRadius());
	}
}
