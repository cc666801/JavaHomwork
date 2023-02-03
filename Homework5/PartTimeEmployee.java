package Homework5;

public class PartTimeEmployee extends Employee {
	private double hourlyWage;
	private int monthlyWorkingHours;
	
	public PartTimeEmployee(String name, String gender, 
							String phone, String email, 
							String onBoardDay, double hourlyWage,
							int monthlyWorkingHours) {
		super(name, gender, phone, email, onBoardDay);
		this.hourlyWage = hourlyWage;
		this.monthlyWorkingHours = monthlyWorkingHours;
		super.setTotalSalary(monthlyWorkingHours * hourlyWage);
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public int getMonthlyWorkingHours() {
		return monthlyWorkingHours;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Employee's hourlyWage is " + hourlyWage);
		System.out.println("Employee's monthlyWorkingHours is " + monthlyWorkingHours);
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hourlyWage=" + hourlyWage + ", monthlyWorkingHours=" + monthlyWorkingHours + "]";
	}
	
	
}
