package bai1;

/**
 *
 * @author huanc_9jkjulx
 */
import java.util.*; //thu vien dung lop Scanner

public class Bai1 {


	public int uCLN(int a, int b){				//tìm ước chung nhỏ nhất bằng đệ quy 
		if(a == b) {
			return a;							//return a và b
		}
		else {
			if(a > b) {
				return uCLN(a-b, b);
			}	
			else {
				return uCLN(a, b-a);
			}
		}
	}
	public int fibonaci(int n){						// tìm số fibonaci bằng đệ quy
		if(n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else{
			return fibonaci(n-1) + fibonaci(n-2);
		}
	}

	public static void main(String agrv[]) 
	{
		int a,b;									
		Scanner input = new Scanner(System.in);
		System.out.println("a =");
		a = input.nextInt();
		System.out.println("b =");								//Nhập vào a và b
		b = input.nextInt();

		System.out.println(new bai1().uCLN(a,b));					//in ra ước chung lớn nhất của a và b
	
		System.out.println("c = ");									//Nhập vào c 
		int c = input.nextInt();

		System.out.println(new bai1().fibonaci(c));					//In ra số fibonaci thứ c 
	}	
}
