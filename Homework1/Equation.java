package Homework1;

public class Equation {
	public static void main(String[] args) {
		// ax**2 + b*x + c=0
		int a = 1;
		int b = 1;
		int c = 1;
		double delta = b*b - 4*a*c; 
		if (delta > 0) {
			System.out.println("有兩個不相等的實根");
		}else if (delta == 0) {
			System.out.println("有兩個相等的實根");
		}else {
			System.out.println("沒有實根");
		}
	}
}
