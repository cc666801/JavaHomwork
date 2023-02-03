package Homework2;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userPassword = "123456";
		String input;
		int count = 0;

		while (count<3) {
			System.out.println("請輸入密碼");
			input = sc.next();
			if(userPassword.equals(input)) {
				System.out.println("密碼輸入正確，歡迎使用本系統！");
				break;
			}else {
				System.out.println("\n密碼輸入錯誤");
			}
			count++;
			if(count == 3) {
				System.out.println("\n密碼輸入超過三次");
			}
		}
		sc.close();
	}
}