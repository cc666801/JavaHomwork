package Homework1;
import java.util.*;


public class Season {
	public static void main(String[] args) {
// Method 1
//		int month = 13;
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("春");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("夏");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("秋");
//			break;
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("冬");
//			break;
//		default:
//			System.out.println("輸入錯誤");
	
		
		
// Method 2
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the month!");
		int month = sc.nextInt();
		sc.close();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		default:
			System.out.println("輸入錯誤");
		}
	}
}
