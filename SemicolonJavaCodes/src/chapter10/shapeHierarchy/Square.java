package chapter10.shapeHierarchy;

public class Square extends TwoDimensional{

	private double length;

	public Square(){
		setLength(0.0);
	}

	public Square(double length){
		setLength(length);
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double calculateArea() {
		return Math.PI * (Math.pow(length, 2));
	}

	@Override
	public String toString() {
		return String.format("%sRadius: %.2f\n", super.toString(), getLength());
	}
}
