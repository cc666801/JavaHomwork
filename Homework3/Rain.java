package Homework3;

public class Rain {
	public static void main(String[] args) {
		
		double all;
		double year;
		double season;
		double month;
		double sum = 0;
		
	// 搜尋資料要用 年-> 季-> 第1,2,3個月
		double[][][] rain = {// 第1年
						{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {3.0, 3.0, 3.0}, {4.0, 4.0, 4.0}}
						// 第2年
						,{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {3.0, 3.0, 3.0}, {4.0, 4.0, 4.0}}
						// 第3年
						,{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {3.0, 3.0, 3.0}, {4.0, 4.0, 4.0}}
						// 第4年
						,{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {3.0, 3.0, 3.0}, {4.0, 4.0, 4.0}}
						// 第5年
						,{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {3.0, 3.0, 3.0}, {4.0, 4.0, 4.0}}};
	
		for (int i=0; i<rain.length; i++) {
			for (int j=0; j<rain[i].length; j++) {
				for (int k=0; k<rain[i][j].length; k++) {
					sum += rain[i][j][k];
				}
			}
		}
		all = sum / rain[0][0].length/ rain[0].length/ rain.length;
		System.out.println("Avg all is " + all);
	}
}
