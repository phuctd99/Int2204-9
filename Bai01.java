package Lab03;
import java.util.Scanner;
public class Bai01 {
	int UCLN(int a, int b) {
		int tmp;
    	while(a!=0){
    		tmp=b%a;
    		b = a;
    		a=tmp;
    	}
    	return Math.abs(b);
	}
	public static void main(String[] args) {
		Bai01 cmd = new Bai01();
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		System.out.println(cmd.UCLN(a, b));
		
	}
}
