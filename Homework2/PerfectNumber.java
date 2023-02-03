package Homework2;

public class PerfectNumber {
	public static void main(String[] args) {
		int number = 7;
		int subtotal = 0;
		for (int i = 1; i < number;i++) {
			if (number % i == 0) {
				subtotal += i;
			}
		}
		if (subtotal == number) {
			System.out.println("Perfect Number!");
		}else {
			System.out.println("Not a perfect Number!");
		}
	}
}
