
import java.util.Scanner;

public class Lab03 {
    private static Scanner scanner = new Scanner(System.in);
    public static int UCLN(int a, int b){
        while (a != b){
            if (a > b) a = a - b;
            if (a < b) b = b - a;
        }
        return a;
    }
    public static int Fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }


    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        // Tinh UCLN của a và b
        System.out.println("UCLN của " + a + " và " + b
                + " là: " + UCLN(a, b));

        // Tinh Fibonaxi cua so nguyen n

        System.out.print("Nhập số fibonaxi cần tính = ");
        int n = scanner.nextInt();
        System.out.println("Số Fibonaxi cần tìm " + Fibonacci(n));
    }
}
