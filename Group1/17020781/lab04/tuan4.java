/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huanc_9jkjulx
 */
public class tuan4{

	public int minArray(int[] a, int num){
		int i = 1;
		int min = a[0];	
		while(i < num){
			
			if(min > a[i]) min = a[i];
			++i;
		}
		return min;
	}
	public int max(int a, int b){
		if(a > b){
			return a;
		}
		else{
			return b;
		}
	}
	public String BMI(double canNang,double chieuCao){
		double bmi = canNang/(chieuCao*chieuCao);
		if(bmi < 18.5){
			return "Thiếu cân";
		}
		else if (bmi >= 18.5 && bmi <23) {
			return "Bình thường";
		}
		else if(bmi >= 23 && bmi < 25){
			return "Thừa cân";
		}
		else{
			return "Béo phì";
		}
		
	}
}