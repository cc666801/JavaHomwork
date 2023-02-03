package Homework2;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 36;
		for (int i = 1;i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
