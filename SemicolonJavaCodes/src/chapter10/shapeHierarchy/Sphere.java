package chapter10.shapeHierarchy;

public class Sphere extends ThreeDimensional{

	private double radius;

	public Sphere(){
		setRadius(0.0);
	}

	public Sphere(double radius){
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
		return (4 * Math.PI)  * (Math.pow(getRadius(), 2));
	}

	public  double calculateVolume(){
		double v = 4/3;
		return (1.3333 * Math.PI) * (Math.pow(getRadius(), 2));
	}

	@Override
	public String toString() {
		return String.format("%sRadius: %.2f\n", super.toString(), getRadius());
	}
}
