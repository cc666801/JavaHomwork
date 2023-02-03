package Homework2;

public class Prime {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number = 21;
        int largePrime = 0;
        int primeCount = 0;// the count of the number be divided

        for (int i = number; i >= 2; i--) {
            primeCount = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    primeCount++;
                }
            }
            if (primeCount == 0) {
                largePrime = i;
                System.out.print(largePrime + " ");
            }
        }
    }
}