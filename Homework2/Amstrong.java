package Homework2;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 153;
		int sum = 0;
		while (number >= 1) {
			sum += Math.pow(number%10, 3);
			number /= 10;
		}
		System.out.println("Total:" + sum);
	}
}
