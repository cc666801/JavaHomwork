package Homework1;

public class Electricity {
	public static void main(String[] args) {
		boolean isOperate = true;
		int degree = 100;
		double charge = 0.0;
		if (isOperate) { // isOperate = true
			if (degree <= 330) {
				charge += degree * 2.12;
			} else if (degree <= 700) {
				charge += (degree - 330) * 2.91 + 330 * 2.12;
			} else if (degree <= 1500) {
				charge += (degree - 700) * 3.44 + 330 * 2.12 + 370 * 2.91;
			} else {
				charge += (degree - 1500) * 5.05 + 330 * 2.12 + 370 * 2.91 + 800 * 3.44;
			}
		} else { // isOperate = false
			if (degree <= 120) {
				charge += degree * 1.63;
			} else if (degree <= 330) {
				charge += (degree - 120) * 2.10 + 120 * 1.63;
			} else if (degree <= 500) {
				charge += (degree - 330) * 2.89 + 210 * 2.10 + 120 * 1.63;
			} else if (degree <= 700) {
				charge += (degree - 500) * 3.94 + 170 * 2.89 + 210 * 2.10 + 120 * 1.63;
			} else if (degree <= 1000) {
				charge += (degree - 700) * 4.6 + 200 * 3.94 + 170 * 2.89 + 210 * 2.10 + 120 * 1.63;
			} else {
				charge += (degree - 1000) * 5.03 + 300 * 4.6 + 200 * 3.94 + 170 * 2.89 + 210 * 2.10 + 120 * 1.63;
			}
		}
		System.out.println(charge);
	}
}
