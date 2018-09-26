package lap03;
import java.util.*;
public class Tuan3 {
	public static void main(String[] args){
		Tuan3 test= new Tuan3();
		//Cau 1a: Tim uoc chung cua hai so nguyen
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap 2 so a,b: ");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("UCLN cua "+a+" va "+b+" la: "+test.UCLN(a,b));
		
		//cau 1b: Tim Fibonaxi cua mot so nguyen n
		System.out.println("Nhap so n:");
		int n=sc.nextInt();
		System.out.println("Gia tri Fibonaxi cua "+n+" la: "+test.Fibonaxi(n));
		
		//thu cac ham:
		PS ps1 =new PS(2,3);
		PS ps2 =new PS(5,6);
		PS ps3=ps1.congPS(ps2);
		System.out.printf("ps1+ps2 la: %d/%d\n",ps3.getTuso(),ps3.getMauso());
		PS ps4=ps1.truPS(ps2);
		System.out.printf("ps1-ps2 la: %d/%d\n",ps4.getTuso(),ps4.getMauso());
		PS ps5=ps1.nhanPS(ps2);
		System.out.printf("ps1*ps2 la: %d/%d\n",ps5.getTuso(),ps5.getMauso());
		PS ps6=ps1.chiaPS(ps2);
		System.out.printf("ps1/ps2 la: %d/%d\n",ps6.getTuso(),ps6.getMauso());
		System.out.println("ps1 co bang ps2? "+ps1.equals(ps2));
		sc.close();
	} 
	//Ham tim ucln
	public int UCLN(int x,int y){
		int x1=Math.abs(x);
		int y1=Math.abs(y);
		if(x==0&&y!=0) return y1;
		if(x!=0&&y==0) return x1;
		
		while(x1!=y1){
			if(x1>y1) x1=x1-y1;
			else y1=y1-x1;
		}
		return x1;
	}
	//Ham tinh Fibonaxi
	public int Fibonaxi(int n){
		if(n==0) return 0;
		else if(n==1) return 1;
		else{
			return (Fibonaxi(n-1)+Fibonaxi(n-2));
		}
	}
	
	
}
