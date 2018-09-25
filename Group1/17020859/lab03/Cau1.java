import java.util.Scanner;

public class Cau1 {

    public int UCLN (int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==b) {
            return a;
        }
        else if (a > b) {
            return UCLN (a-b, b);
        }
        else {
            return UCLN (a, b-a);
        }
    }

    public int Fibonacci (int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main (String[] argh) {
        Cau1 cau1 = new Cau1();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(cau1.UCLN(a, b));

        int n = sc.nextInt();
        System.out.println(cau1.Fibonacci(n));
        sc.close();
    }
}
