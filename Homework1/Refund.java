package Homework1;

public class Refund {
	public static void main(String[] args) {
		int price = 130;
		int yourPay = 1000;
		if (price > yourPay) {
			System.out.println("不必找錢");
		} else {
			yourPay -= price;
			if (yourPay / 500 != 0) {
				System.out.println(yourPay / 500 + " paper money 500 should make change!");
			}
			yourPay %= 500;
			if (yourPay / 100 != 0) {
				System.out.println(yourPay / 100 + " paper money 100 should make change!");
			}
			yourPay %= 100;
			if (yourPay / 50 != 0) {
				System.out.println(yourPay / 50 + " coin money 50 should make change!");
			}
			yourPay %= 50;
			if (yourPay / 10 != 0) {
				System.out.println(yourPay / 10 + " coin money 10 should make change!");
			}
			yourPay %= 10;
			if (yourPay / 5 != 0) {
				System.out.println(yourPay / 5 + " coin money 5 should make change!");
			}
			yourPay %= 5;
			if (yourPay / 1 != 0) {
				System.out.println(yourPay / 1 + " coin money 1 should make change!");
			}
		}
	}
}
