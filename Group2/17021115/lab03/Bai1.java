import java.util.Scanner;

public class Bai1 {

	public  int Fibonaci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return Fibonaci(n-1) + Fibonaci(n-2); 
	}
        public  int UCLN(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while(a!=b) {
			if(a>b) {
				a -= b;
			}
			else
				b -= a;
		}
		return a;
	}
	public static void main(String[] args) {
                Bai1 test = new Bai1();
		System.out.print("Nhập số n: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Fibonaci của n là: " + test.Fibonaci(n));
                
                int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập 2 số a, b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Ước chung lớn nhất của " + a + ", " + b + " là: " + test.UCLN(a, b));
	}

}