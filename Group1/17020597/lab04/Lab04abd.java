package Lab04;

public class Lab04abd {
	public static int maximumNumber(int num1, int num2) {
		if(num1 > num2) return num1;
		return num2;
	}
	public static int minimumArr(int[] Arr) {
		int sz = Arr.length;
		int min = Arr[0];
		for(int i = 1; i < sz; i++) {
			if(min > Arr[i]) min = Arr[i];
		}
		return min;
	}
	public static String BMI(double w, double h) {
		double bmi = w/(Math.pow(h, 2));
		if(bmi < 18.5) return "Thiếu cân";
		if(bmi >= 18.5 && bmi < 23) return "Bình thường";
		if(bmi >= 23 && bmi < 24.99) return "Thừa cân";
		return "Béo phì";
		
	}
}
