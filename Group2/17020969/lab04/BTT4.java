public class BTT4 {

	public static int MAX(int a, int b) {
		int max;
		if(a > b) {
			max = a;
		}
		else{
			max = b;
		}
		return max;
	}
	
	
	public static int ArrMIN(int a[]) {
		int min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static String timBMI(double weight, double height) {
		double BMI = weight / (height * height);
		double a = Math.round(BMI *100)/100;
		String test = null;
		if(a < 18.5) {
			test = "Thieu can";
		}
		else if(a >= 18.5 && a < 23) {
			test = "Binh thuong";
		}
		else if(a >= 23 && a < 25) {
			test = "Thua can";
		}
		else if(a >= 25) {
			test = "Beo phi";
		}
		return test;
	}
	
}
