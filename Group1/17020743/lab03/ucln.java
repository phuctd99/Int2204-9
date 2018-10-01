import java.util.Scanner;

public class ucln {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        new ucln().ucln(4,2);
//        System.out.println(ucln(a, b));
    }

    public int ucln(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}
