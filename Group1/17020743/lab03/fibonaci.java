import java.util.Scanner ;
/*public static int sumarr {
    int [] a = new int[100] ;
    int d = 0 ;
    for (int i  = 0 ; i < 100 ; i++) {
        d = d + a[i] ;
        }
        return d ;
        } */

public class fibonaci {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so n: ") ;
        int n = sc.nextInt();
        fibonaci fb = new fibonaci();
        System.out.println(fb.fbnc(n));


    }

    public static int fbnc(int n) {
       //  int [] a = new int[100] ;
       //  a[0] = 0 ;
        // a[1] = 1 ;
       // int f ;
       //  for (int i = 2 ; i < 100 ; i++)  {
        //     a[i] = a[i-1] + a[i-2] ;
      //   }
       //   f = a[n] ;
       //   return f ;
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        int sum = 2 ;
        if (n < 0) {
           return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 4; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                sum = sum + fn;
            }

        }
        return sum;
    }
}
    /*public static void main(String[] args)
    {
        System.out.print("hello");

    }*/



