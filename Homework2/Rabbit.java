package Homework2;

public class Rabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiple1 = 3;
		int multiple2 = 5;
		int multiple3 = 7;
		int number = 1;
		while(number%multiple1 != 1 || number%multiple2 !=3 || number%multiple3 !=2) {
			number++;
		}
		System.out.print(number);
	}
}
