package Lab03;
import java.util.Scanner;
public class Bai102 {
	void Fibonacii(int n, int a, int b) {
		if(a == 0 && b == 1) {
			System.out.print(0 + " "+ 1 + " ");
		}
		if(n >= 2 && b <= n) {
			int cnt = a+b;
			System.out.print(cnt+" ");
			a= b;
			b = cnt;
			Fibonacii(n, a, b);
		}
	}
	public static void main(String[] args) {
		Bai102 cmd = new Bai102();
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.close();
		cmd.Fibonacii(n, 0, 1);
	}
	
}
