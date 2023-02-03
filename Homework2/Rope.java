package Homework2;

public class Rope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 3000;
		int days = 0;
		int finalLength = 5;
		while (length >= finalLength) {
			days += 1;
			length /= 2;
			System.out.println(length);
		}
		System.out.println(days);
	}
}
