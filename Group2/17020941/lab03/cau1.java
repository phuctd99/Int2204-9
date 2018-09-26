package oop_tuan3;

public class cau1 {
	public int UCLN (int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return UCLN(num2, num1 % num2);
		}
	}
	
	public int Fibonaxi(int n) {
		if (n == 0)return 0;
		else if (n == 1) return 1;
		else {
			return Fibonaxi(n - 1) + Fibonaxi(n - 2);
		}
	}
	
	public static void main(String[] args) {
		cau1 test = new cau1();
		System.out.println(test.UCLN(10,2));
		System.out.println(test.Fibonaxi(4));
	}
}
