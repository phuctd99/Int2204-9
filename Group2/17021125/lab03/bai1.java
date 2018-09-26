import java.util.Scanner;

public class bai1 {
    public  int UCLN (int a, int b){
        int x = Math.abs(a);
        int y = Math.abs(b);
        while ( x != y){
            if (x > y){
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        return x;
    }

    public  int Fibonaxi(int n) {
        int tong = 0;
        int []arr = new int [n+1];
        arr [0] = 0;
        arr [1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i-2];
            tong = arr[i];
        }
        return tong;
    }

    public static void main(String[] args) {
        bai1 uc = new bai1();
        System.out.println("a,Tim uoc chung lon nhat");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.print("Uoc chung lon nhat cua a va b la: ");
        System.out.println(uc.UCLN(a,b));

        bai1 f = new bai1 ();
        System.out.println("b,Day Fibonaxi");
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        System.out.print("F(" + n + ") = " + f.Fibonaxi(n));
    }
}
