import java.util.Scanner;

public class Bai1 {

    //Ham tinh uoc chung lon nhat cua 2 so nguyen

    public  int UCLN(int a, int b){
        while(Math.abs(a) != Math.abs(b)){
            if(Math.abs(a) > Math.abs(b)) a = Math.abs(a) - Math.abs(b);
            else b = Math.abs(b) - Math.abs(a);
        }
        return a;
    }

    //Ham tinh Fibonaxi cua 1 so nguyên

    public  int Fibonaxi(int n){
    if(n == 0) return n;
    else if(n == 1) return n;
    else return Fibonaxi(n-1) + Fibonaxi(n-2);
    }

    public static void main(String[] args){
        Bai1 b1 = new Bai1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 2 so nguyen : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int u = b1.UCLN(a,b);
        System.out.println("Uoc chung lon nhat : " + u);

        System.out.print("Nhap 1 so nguyen : ");
        int n = sc.nextInt();
        System.out.print("So thu " + n + " thuoc day Fibonaxi : ");
        int c = b1.Fibonaxi(n);
        System.out.println(c);
    }
}
