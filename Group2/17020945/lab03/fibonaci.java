import java.util.Scanner;

public class fibonaci {
	public static void main(String[] args){
		fibonaci a=new fibonaci();
		Scanner scanner= new Scanner(System.in);
		//nhap so nguyen n
		System.out.println("nhap so nguyen n: ");
		int n= scanner.nextInt();
		//in ra fibonaxi cua so nguyen n
		System.out.println("Fibonaxi cua so "+n +" la: "+a.fibonaxi(n));

	}
	//tinh fibonaxi cua so nguyen n
	public int fibonaxi(int n)
	{
		int[] a= new int[n+1];
		if(n==0)return n;
		if(n==1)return n;
		if(n>1){
			a[0]=0;
			a[1]=1;
			for(int i=2;i<n+1;i++) {
				a[i] = a[i - 1] + a[i - 2];
			}
		}
		return a[n];
	}
}
