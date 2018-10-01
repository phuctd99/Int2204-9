package Test;

import java.util.Arrays;

public class MinMaxandBMI {
	public static int Maxab(int a, int b) {
		if (b > a) {
			return b;
		}
		return a;
		
	}
	public static int MinArr(int [] arr) {
		Arrays.sort(arr);
		int min = arr[0] ;
		return min;	
	}
	
	public static String printBMI(double weight,double height) {
		double bmi =  weight / (height*height);
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
