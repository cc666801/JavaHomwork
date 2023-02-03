package Homework2;

import java.lang.*;

public class Stars {
	public static void main(String[] args) {
//		String star1 = "* ";
//		StringBuilder str = new StringBuilder("* ");
//		for (int i = 5; i > 0; i--) {
//			System.out.println(str);
//			str.append(star1);
//		}

//		StringBuilder star2 = new StringBuilder("* * * * *");
//		for (int i = 5; i > 0; i--) {
//			String str2 = star2.toString();
//			System.out.printf("%10s",str2 + "\n");
//			star2 = star2.delete(0,2);
//		}

//		String stars3 = "*";
//		StringBuilder str = new StringBuilder("    *");
//		for (int i = 5; i >= 1; i--) {
//			String str3 = str.toString();
//			System.out.printf(str3 + "\n");
//			str.replace(i-2, i-1, "*");
//			str.append(stars3);

		String star3 = "";
		String space = "    ";
		String star = "*";
		String starSave = "*";
		for (int i = 5; i >= 1; i--) {
			star3 = space + starSave + space;
			System.out.println(star3);
			starSave = starSave + star + star;
			StringBuilder strSpace = new StringBuilder(space);
			strSpace.delete(0, 1);
			space = strSpace.toString();
		}
	}
}
