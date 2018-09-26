import java.util.Scanner;
public class Bai1
{
	public int ucln(int a,int b)
	{
		a=Math.abs(a);
		b=Math.abs(b);
		if(a==0) return b;
		if(b==0) return a;
		while(a!=b)
		{
			if(a>b) a=a-b;
			else b=b-a;
		}
		return a;
	}
	public int fibonaxi(int n)
	{
		if(n==0) return 0;
		if(n==1) return 1;
		return fibonaxi(n-1)+fibonaxi(n-2);
	}
	public static void main(String[] args) {
		int a,b,n;
		Scanner tmp=new Scanner(System.in);
		a=tmp.nextInt();
		b=tmp.nextInt();
		n=tmp.nextInt();
		Bai1 test=new Bai1();
		System.out.println(test.ucln(a,b));
		System.out.println(test.fibonaxi(n));
	}
}