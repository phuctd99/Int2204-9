import java.util.Scanner;

public class bai1lab3 {
    //Tìm ước chung lớn nhát
    public int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if ((a == 0) || (b == 0)) {
            if (a == 0) {
                return b;
            }
            if (b == 0) {
                return a;
            }
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }

        }
        return a;
    }

    //Fibonaci
    public int Fibonaxi(int n) {
        int result = 0;
        if (n == 0) {
            result = 0;
        }
        if (n == 1) {
            result = 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            result = b + a;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        bai1lab3 x = new bai1lab3();
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(x.UCLN(a, b));
        int n;
        n = scan.nextInt();
        System.out.println(x.Fibonaxi(n));

    }
}
