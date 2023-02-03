package Homework1;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2000;
		if (year % 400 == 0) {
			System.out.println("Is Leap year! Can evenly divisibled by 400!");
		} else if (year % 100 == 0) {
			System.out.println("Isn't Leap year! Can evenly divisibled by 100!");
		}else {
			if (year % 4 == 0) {
				System.out.println("Is Leap year! Can evenly divisibled by 4!");
			} 
		}
	}
}
