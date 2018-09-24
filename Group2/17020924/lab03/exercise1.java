package exercise1;

public class exercise1 {
	public int UCLN(int a,int b) {
		if(b==0) {
			return a;
		}
		return UCLN(b,a%b);
	}
	public int fibonaci(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else {
			return fibonaci(n-1) + fibonaci(n-2);
		}
		
	}
	public static void main(String[] args) {
		exercise1 ex1 = new exercise1();
		System.out.println("UCLN = " + ex1.UCLN(15,40));
		System.out.println(ex1.fibonaci(10));
	}

}
