package Homework5;

public class SalesRepresenttative extends FullTimeEmployee {
	
	private int salesBonus;
	
	public SalesRepresenttative(String name, String gender, 
								String phone, String email, 
								String onBoardDay, int salary, int luncheonAllowance,
								int salesBonus) {
		super(name, gender, phone, email, onBoardDay, salary, luncheonAllowance);
		this.salesBonus = salesBonus;
		super.setTotalSalary(salary + luncheonAllowance + salesBonus);
	}

	public int getSalesBonus() {
		return salesBonus;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Employee's salesBonus is " + salesBonus);
	}

	@Override
	public String toString() {
		super.toString();
		return "SalesRepresenttative [salesBonus=" + salesBonus + "]";
	}
}
