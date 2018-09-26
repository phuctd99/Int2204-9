package uocchunglonnhat_fibonacci;
import java.util.*;

public class UCLN {
    private
    int a;
    int b;

    public UCLN(int a, int b){  //khai báo tuong tự
        this.a = a;
        this.b = b;
    }

    public UCLN() {        //khai báo không khởi tạo
        this.a = 0;
        this.b = 0;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }


    static Scanner sc = new Scanner(System.in);

    public int timUcln(){         //tìm UCLN
        int absA = Math.abs(this.getA());
        int absB = Math.abs(this.getB());
        while (absA != absB) {
            if (absA > absB)
                absA = absA - absB;
            else {
                absB = absB - absA;
            }
        }
        return (absA);
    }


    public static int fibo(int n){// tính fibonacci
        if (n == 0) return 0;
        else
        if (n == 1) return 1;
        else {
            int fn[] = new int[n + 1];
            fn[0] = 0;
            fn[1] = 1;

            for (int i = 2; i <= n; i++)
            {
                fn[i] = fn[i-2] + fn[i-1];
            }
            return fn[n];
        }
    }

    public static void main(String args[]) {
        UCLN test = new UCLN();
        int n;
        System.out.println("Nhập hai số: ");
        test.setA(sc.nextInt());
        test.setB(sc.nextInt());
        System.out.println("Ước chung lớn nhất của hai số: " + test.timUcln());
        System.out.println("Nhap so fibonacci can tinh: ");
        n = sc.nextInt();
        System.out.println(fibo(n));
    }

}