package Homework5;

public abstract class FullTimeEmployee extends Employee {
	private int salary;
	private int luncheonAllowance;
	
	public FullTimeEmployee(String name, String gender, 
							String phone, String email, 
							String onBoardDay, int salary, int luncheonAllowance) {
		super(name, gender, phone, email, onBoardDay);
		this.salary = salary;
		this.luncheonAllowance = luncheonAllowance;
	}

	public int getSalary() {
		return salary;
	}

	public int getLuncheonAllowance() {
		return luncheonAllowance;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Employee's salary is " + salary);
		System.out.println("Employee's luncheonAllowance is " + luncheonAllowance);
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + ", luncheonAllowance=" + luncheonAllowance + "]";
	}
	
	
}
