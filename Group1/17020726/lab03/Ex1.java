import java.util.Scanner;

public class Ex1
{
    static int GCD(int a, int b)
    {
        int temp;
        while (a % b != 0)
        {
            temp = a % b;
            a = b;
            b = temp;
        }
        return (b > 0)?b:(-b);
    }

    static int fibo (int n)
    {
        if (n == 0|| n == 1) return n;
        int fibo1 = 0, fibo2 = 1, fibo = 0;
        int i = 2;
        while (i <= n)
        {
            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;
            i++;
        }
        return fibo;
    }

    public static void main(String[] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = -6;
        b = 3;
        System.out.println("ex1a: " + GCD(a, b));
        System.out.println("ex1b: " + fibo(3));

        PS ps1 = new PS(-10, 5);
        ps1.simplyfiPS();
        ps1.printPS();
    }
}
