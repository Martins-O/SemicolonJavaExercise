package chapter10.shapeHierarchy;

public class Cube extends ThreeDimensional{

	private double edge;

	public Cube(){
		setEdge(0.0);
	}

	public Cube(double e){
		setEdge(e);
	}

	public void setEdge(double e) {
		this.edge = e;
	}

	public double getEdge() {
		return edge;
	}

	@Override
	public double calculateVolume() {
		return Math.pow(getEdge(), 3);
	}

	@Override
	public double calculateArea() {
		return 6 * (Math.pow(getEdge(), 2));
	}

	@Override
	public String toString() {
		return String.format("%sRadius: %.2f\n", super.toString(), getEdge());
	}
}
