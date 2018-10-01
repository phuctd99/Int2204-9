package Test;

public class MinMaxandBMI {
	public static int Maxab(int a, int b) {
		if (b > a) {
			return b;
		}
		return a;
		
	}
	public static int MinArr(int[] arr) {
		int Min = arr[0];
		if (arr.length == 1) {
			return Min;
		}
		for (int i = 0;i < arr.length;i++) {
			if (Min > arr[i]) {
				Min = arr[i];
			}
		}
		return Min;
		
	}
	public static double BMI(double weight, double height) {
		return weight / (height*height);
	}
	public static String printBMI(double weight,double height) {
		double bmi = BMI(weight,height);
		if (bmi<18.5) {
			return "Thiếu cân";
		}
		else if (bmi>=18.5&&bmi<23) {
			return "Bình thường";
		}
		else if(bmi>=23&&bmi<24.99) {
			return "Thừa cân";
		}
		return "Béo phì";
		
	}
}
