package Homework5;

public abstract class Employee {
	

	private String name;
	private String gender;
	private String phone;
	private String email;
	private String onBoardDay;
	private double totalSalary;

	public Employee(String name, String gender, 
					String phone, String email, 
					String onBoardDay)  {
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.onBoardDay = onBoardDay;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getOnBoardDay() {
		return onBoardDay;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	
	public void printData() {
		System.out.println("Employee's name is " + name);
		System.out.println("Employee's gender is " + gender);
		System.out.println("Employee's phone is " + phone);
		System.out.println("Employee's email is " + email);
		System.out.println("Employee's onBoardDay is " + onBoardDay);
		System.out.println("Employee's totalSalary is " + totalSalary);
	}
	
	@ Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", phone=" + phone + ", email=" + email
				+ ", onBoardDay=" + onBoardDay + ", totalSalary=" + totalSalary + "]";
	}

}
