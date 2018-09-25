package lab3;

import java.util.Scanner;

public class Bai_1 {
    //Tìm ước chung lớn nhát
    public static int UCLN (int a, int b){
        if (a < 0) {
            a = -a;
        }
        if (b < 0){
            b = -b;
        }
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
    public static int Fibonaxi (int n){
        
        if(n == 0 ) return 0;
        if(n == 1 ) return 1;
        int a =0;
        int x =0, y = 1;
        for (int i = 2; i <= n; i++){
            a = x+y;
            x = y;
            y = a;
    }
        return a;
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
        System.out.println(Fibonaxi(n));

    }
}