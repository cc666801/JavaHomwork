package Homework5;

public class Circle implements Shape {
		
	private double PI = Math.PI;
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return radius * radius * PI;
	}

	public double computeCircumference() {
		return 2 * radius * PI;
	}
}
