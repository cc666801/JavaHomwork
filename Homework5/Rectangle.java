package Homework5;

public class Rectangle implements Shape {
	private double area;
	private double circumference;
	private double length;
	private double width;

	public double computeArea() {
		return length * width;
	}

	public double computeCircumference() {
		return 2 * (length + width);
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
