package Homework3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] count = {{33, 32, 56, 45, 33}, {77, 33, 68, 45, 23}, {43, 55, 43, 67, 65}};
		int[] price = {12, 16, 10, 14, 15};
		int[] answerA = new int [3];
		int answerB = 0;
		int[] answerC = new int [5];
		int answerD = 0;
		
		// Use sum to statistics
		int sum = 0;
		
		
		// Answer a
		for (int i = 0; i < count.length ; i++) {
			for (int j = 0; j < count[i].length ; j++) {
				sum += count[i][j] * price[j];
			}
			answerA[i] = sum;
			sum = 0;
		}
		System.out.println(Arrays.toString(answerA));
		 
		// Answer b
		// Use maxPerson to find person
		int maxPerson = 0;
		int maxSale = 0;
		
		for (int i = 0; i <answerA.length; i++) {
			if (answerA[i] > maxSale) {
				maxPerson = i + 1;
				maxSale = answerA[i];
			}
		}
		System.out.println("The best salesman is No." + maxPerson);
		
		// Answer c
		// Use testNum to control j = 0, 1, 2, 3, 4
		int testNum = 0;
		while (testNum < 5) {
			for (int i = 0; i < count.length; i++) {
				for (int j = 0; j < count[i].length; j++) {
					if (j == testNum) { 
						// count[i][0] * price[0], count[i][1] * price[1]..... 共5筆資料
						sum += count[i][j] * price[j];
					}
				}
			}
			answerC[testNum] = sum;
			sum = 0;
			testNum++;
		}
		System.out.println(Arrays.toString(answerC));
		
		// Answer d
		// Use maxSales to find the best sale product
		
		int maxSales = 0;
		int maxProduct = 0;
		
		for (int i = 0; i <answerC.length; i++) {
			if (answerC[i] > maxSales) {
				maxProduct = i;
				maxSales = answerC[i];
			}
		}
		System.out.println("Best sale product is No." + maxProduct);
		System.out.println("Best sale product is No." + maxSales);
	}
}











