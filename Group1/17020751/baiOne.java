import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class baiOne {

    //ham tinh uoc chung lon nhat
    public  int Ucln(int a, int b)
    {
        while( a != b )
        {
            if (a>b)
            {
                a = a-b;
            }
            else b = b-a;
        }
        return a;
    }

    // ham tinh fibonaxi cua so nguyen n
    public int Fibonaxi(int n)
    {
        int a = 0;
        int b = 1;
        int c = a + b;

        if ( n == 0) return a;
        else if ( n == 1 ) return b;
        else {

            for (int i=3; i<=n; i++) {
                a = b;
                b = c;
                c = a + b;

            }
        }
        return c;

    }

    public  static void main(String[] args)
    {
        Scanner inPut = new Scanner(System.in);
        baiOne abc = new baiOne();

        int st1 = inPut.nextInt();
        int st2 = inPut.nextInt();

        System.out.println(abc.Ucln(st1,st2));

        int n = inPut.nextInt();
        System.out.print(abc.Fibonaxi(n));
    }
}
