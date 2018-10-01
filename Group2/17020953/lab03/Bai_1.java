package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_1 {
    //Tìm ước chung lớn nhát
    public static int UCLN (int a, int b){
       a=Math.abs(a);
       b=Math.abs(b);
        while (a != b){
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    //Fibonaci
    public static int[] Fibonaxi (int n){
        
		int[] fibonaxi = new int[n];
		fibonaxi[0] = 0;
		fibonaxi[1] = 1;
		for (int i = 2; i < n; i++)
		{
			fibonaxi[i] =  fibonaxi[i-1] + fibonaxi[i-2];
                }
                return fibonaxi ;
    }
   public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        Bai_1 x = new Bai_1();
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(UCLN(a, b));
        int n;
        n = scan.nextInt();
        System.out.println(Arrays.toString(Fibonaxi(n)));

    }
}