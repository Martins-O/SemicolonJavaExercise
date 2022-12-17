package chapter10.shapeHierarchy;

public class Tetrahedron extends ThreeDimensional{

	private double edge;

	public Tetrahedron(){
		setEdge(0.0);
	}

	public Tetrahedron(double e){
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
		return Math.pow(getEdge(), 3) * Math.pow(getEdge(), 2);
	}

	@Override
	public double calculateArea() {
		return Math.sqrt(3) * (Math.pow(getEdge(), 2));
	}

	@Override
	public String toString() {
		return String.format("%sRadius: %.2f\n", super.toString(), getEdge());
	}
}

