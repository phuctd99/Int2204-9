package oop_tuan4;

import java.util.Arrays;

public class main {
	static int getMax(int a, int b) {
		if (a > b) return a;
		else return b;
	}
	static int findMin(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	static String BMI(double chieuCao, double canNang) {
		double bmi = canNang / (chieuCao * chieuCao);
		if (bmi > 25) {
			return "beo phi";
		}
		else if (bmi > 23) {
			return "thua can";
		}
		else if (bmi > 18.5) {
			return "binh thuong";
		}
		else {
			return "thieu can";
		}
	}
}
