import java.util.Scanner;

public class ucln {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ucln n=new ucln();
		//nhap hai so nguyen a & b
		System.out.println("nhap so nguyen a: ");
		int a=scanner.nextInt();
		System.out.println("nhap so nguyen b: ");
		int b=scanner.nextInt();
		//in ucln cua a & b
		System.out.println("UCLL cua a & b: " + n.USCLN(a, b));
	}
	public int USCLN(int a, int b){
		a=Math.abs(a);
		b=Math.abs(b);
		if(b==0)return a;
		if(a==0)return b;
		while(a!=b){
			if(a>b)a=a-b;
			else b=b-a;
		}
		return a;
	}
}
