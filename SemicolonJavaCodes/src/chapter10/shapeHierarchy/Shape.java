package chapter10.shapeHierarchy;

public abstract class Shape {

	@Override
	public String toString() {
		return String.format("%s\n", getClass().getName());
	}
}
