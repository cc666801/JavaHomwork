<<<<<<< HEAD
package Homework4;

public class Test {

	public static void main(String[] args) {
		MyCalendar cal = new MyCalendar();
		cal.check(2023, 3, 2);

	}

=======
package Homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception {
		
		// Employee Practice
		
//		Supervisor eason1 = new Supervisor("Eason1", "male", "0911111111", "cc111111@gmail.com", "20010101", 40000, 150, 2000, 3000);
//		SalesRepresenttative eason2 = new SalesRepresenttative("Eason2", "male", "0911111111", "cc111111@gmail.com", "20010101", 20000, 150, 300);
//		GeneralStaff eason3 = new GeneralStaff("Eason3", "male", "0911111111", "cc111111@gmail.com", "20010101", 40000, 150);
//		PartTimeEmployee eason4 = new PartTimeEmployee("Eason4", "male", "0911111111", "cc111111@gmail.com", "20010101", 150, 140);
//		eason3.printData();
		
		//Shape Practice
		
//		Circle circle = new Circle();
//		circle.setRadius(1);
//		circle.computeCircumference();
//		System.out.println(circle.computeArea());
//		System.out.println(circle.computeCircumference());
		
//		Rectangle rect = new Rectangle();
//		rect.setLength(3);
//		rect.setWidth(2);
//		System.out.println(rect.computeArea());
//		System.out.println(rect.computeCircumference());
		
		// Stack Practice
		
//		Stack stack = new Stack();
//		stack.push(100);
//		stack.push(200);
//		stack.push(300);
//		stack.push(300);
//		stack.pop();
//		stack.pop();
//		stack.pop();
		
		// Stack method2 (use Stack1)
		int[] testArray = new int[5];
		int top = 0;
		for(int i = 0; i < 3; i++) {
			testArray[i] = i+1;
			top++;
		}
		Stack1 testStack1= new Stack1(testArray, top);
		testStack1.push(100);
		testStack1.push(100);
		testStack1.push(100);
		testStack1.pop();
		testStack1.pop();
		testStack1.pop();
		testStack1.pop();
		testStack1.pop();
		testStack1.pop();
//		
		
		
		
		
		
		// EmployeeFile Practice
		
//		BufferedReader in = new BufferedReader(new FileReader("C:\\JAVA\\workspace\\Homework\\else\\Homework5EmployeeFile.txt"));
//		String thisLine;
//		ArrayList<Employee> data= new ArrayList<>();
//		while((thisLine = in.readLine()) != null) {
//			// Create new ArrayList to save data
//			ArrayList<String> basicData =new ArrayList<>();
//			// Spilt thisline to a String[] items
//			String [] items = thisLine.split("\\s*,\\s*");
//			// Let items to String and set into ArrayList<String> basicData
//			for(int i = 0; i < items.length; i++) {
//				basicData.add(items[i]);
//			}
//			// Check basicData.get(0) to call constructor
//			if (basicData.get(0).equals("1")) {
//				Supervisor eason1 = new Supervisor(basicData.get(1), basicData.get(2), 
//											basicData.get(3), basicData.get(4), basicData.get(5),
//											Integer.parseInt(basicData.get(6)),Integer.parseInt(basicData.get(7)),
//											Integer.parseInt(basicData.get(8)), Integer.parseInt(basicData.get(9)));
//				data.add(eason1);
//			}else if (basicData.get(0).equals("2")) {
//				SalesRepresenttative eason2 = new SalesRepresenttative(basicData.get(1), basicData.get(2), 
//											basicData.get(3), basicData.get(4), basicData.get(5),
//											Integer.parseInt(basicData.get(6)),Integer.parseInt(basicData.get(7)),
//											Integer.parseInt(basicData.get(8)));
//				data.add(eason2);
//			}else if (basicData.get(0).equals("3")) {
//				GeneralStaff eason3 = new GeneralStaff(basicData.get(1), basicData.get(2), 
//											basicData.get(3), basicData.get(4), basicData.get(5),
//											Integer.parseInt(basicData.get(6)),Integer.parseInt(basicData.get(7)));
//				data.add(eason3);
//			}else if (basicData.get(0).equals("4")) {
//				PartTimeEmployee eason4 = new PartTimeEmployee(basicData.get(1), basicData.get(2), 
//											basicData.get(3), basicData.get(4), basicData.get(5),
//											Integer.parseInt(basicData.get(6)),Integer.parseInt(basicData.get(7)));
//				data.add(eason4);
//			}
//			
//		}
//		System.out.println(data.size());
	}
>>>>>>> 4021329f21cb9503438342d9ce24006b42ebba30
}
