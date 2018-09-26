package baitaptuan3;
import java.util.Scanner;

public class uocsochunglonnhat {
	
	public static int USCLN(int a, int b)
	{
		
		if(b == 0) return a;
		return USCLN(b, a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so a : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("nhap so b : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("UCLN: ");
		System.out.print(USCLN(a, b));
	
		
	
	}
	
	
}
