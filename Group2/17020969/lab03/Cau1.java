import java.util.Scanner;

public class Cau1 {
    public int UCLN(int a, int b) {
        // a, b la so nguyen < 0; thi lay gia tri tuyet doi cua a va b
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0)
        {
            return (a+b);
        }
        // khi a khac b
        while(a != b) {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a ;
            }
        }
        return a;
    }

    /*
      Tính số fibonacci thứ n
      n: chỉ số của số fibonacci tính từ 0
      vd: F0 = 0, F1 = 1, F2 = 1, F3 = 2
      return số fibonacci thứ n
    */
    public int fibonaxi(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        // khi n == 0, n == 1 thi fn = n (chinh no)
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cau1 c = new Cau1();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int ucln = c.UCLN(a, b);

        System.out.println("UCLN cua " + a + " va " + b + " la: " + ucln);
        System.out.print("Fibonaxi cua so " + n + " la: ");
        System.out.println(c.fibonaxi(n));
    }
}
