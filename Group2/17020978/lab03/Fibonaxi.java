import java.util.Scanner;

public class Fibonaxi{

    static int fibo(int n)
    {
        int sum = 0;
        if(n==0)
            return sum;
        if(n==1)
            return 1;

        int suma = 0;
        int sumb = 1;
        int[] arr = new int[n];
        int sumc=0;
            for(int i=2; i<=n; i++)
            {
                sumc = suma + sumb;
                suma = sumb;
                sumb = sumc;
            }
            return sumc;
    }
/*  
  static int fibo(int n)
    {

        if(n==0)
            return 0;
        
        if(n==1)
            return 1;

        return fibo(n-1) + fibo(n-2);


    }
*/
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        System.out.println(fibo(x));
    }
}