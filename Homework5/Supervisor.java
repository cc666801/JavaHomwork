package Homework5;

public class Supervisor extends FullTimeEmployee {

	private int performanceBonus;
	private int transportationAllowance;

	public Supervisor(String name, String gender, 
					  String phone, String email, 
					  String onBoardDay, int salary,
					  int luncheonAllowance, int performanceBonus,
					  int transportationAllowance) {
		super(name, gender, phone, email, onBoardDay, salary, luncheonAllowance);
		this.performanceBonus = performanceBonus;
		this.transportationAllowance = transportationAllowance;
		super.setTotalSalary(salary + luncheonAllowance + performanceBonus + transportationAllowance);
	}

	public int getPerformanceBonus() {
		return performanceBonus;
	}

	public int getTransportationAllowance() {
		return transportationAllowance;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Employee's performanceBonus is " + performanceBonus);
		System.out.println("Employee's transportationAllowance is " + transportationAllowance);
	}

	@Override
	public String toString() {
		return "Supervisor [performanceBonus=" + performanceBonus + ", transportationAllowance="
				+ transportationAllowance + "]";
	}
	
}
