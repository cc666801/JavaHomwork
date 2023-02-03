package Homework2;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 100000;
		double rate1 = 0.1;
		double rate2 = 0.05;
		double result1;
		double result2;
		int year = 0;
		while(true) {
			year++;
			result1 = 1 + rate1 * year;
			System.out.println(result1);
			rate1 = 0.1;
			result2 = Math.pow(1 + rate2, year);
			System.out.println(result2);
			if (result2 > result1) {
				break;
			}
		}
		System.out.println(year);
	}
}
