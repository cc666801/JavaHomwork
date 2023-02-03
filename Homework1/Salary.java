package Homework1;

public class Salary {
	public static void main(String[] args) {
		int hourSalary = 150;
		int workHour = 90;
		int salary = 0;
		if (workHour <= 60) {
			salary += hourSalary * workHour;
		}else if (workHour <= 80) {
			salary += hourSalary * 60 + hourSalary * (workHour - 60) *1.25;
		}else {
			salary += hourSalary * 60 + hourSalary * 20 * 1.25 + hourSalary * (workHour - 80) *1.5;
		}
		System.out.println("Salary is $" + salary);
	}
}
