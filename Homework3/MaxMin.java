package Homework3;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,5,6,7,8,11,10};
		int maxNum = data[0];
		int minNum = data[0];
		for(int i = 0;i < data.length; i++) {
			if (data[i] > maxNum) {
				maxNum = data[i];
			}
			if (data[i] < minNum) {
				minNum = data[i];
			}
		}
		System.out.println(maxNum + " " + minNum);
	}
}
