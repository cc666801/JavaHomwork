package Homework5;

public class GeneralStaff extends FullTimeEmployee {
	
	public GeneralStaff(String name, String gender, 
						String phone, String email, 
						String onBoardDay, int salary, int luncheonAllowance) {
			super(name, gender, phone, email, onBoardDay, salary, luncheonAllowance);
			super.setTotalSalary(salary + luncheonAllowance);
	}
}
