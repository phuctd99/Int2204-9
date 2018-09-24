import java.util.Scanner;

public class cau1 {

    //Ham tim UCLN cua hai so nguyen a va b
    public int UCLN( int a, int b)
    {

        a = Math.abs( a );
        b = Math.abs( b );
        if( a==0 && b!=0)
        {
            System.out.println( b );
        }
        else if( b==0 && a!=0 )
        {
            System.out.println( a );
        }
        else
        {
            while( a!=b )
            {
                if( a>b )
                    a = a-b;
                else
                    b = b-a;
            }
        }
        return a;
    }

    //Ham tinh Fibonacci cua mot so nguyen n
    public int Fibonacci( int n )
    {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if( n==0 || n==1)
        {
            return n;
        }
        else
        {
            for( int i=2; i<n; i++)
            {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public Scanner scn = new Scanner( System.in );
    //Phuong thuc main de kiem tra cac ham
    public static void main( String[] args)
    {

        cau1 c1 = new cau1();
        //Nhap vao hai so nguyen a, b de kiem tra ham tim UCLN
        System.out.print("Nhap vao so nguyen a: ");
        int a = c1.scn.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        int b = c1.scn.nextInt();
        //Kiem tra ham tim UCLN
        System.out.println("Uoc chung lon nhat cua hai so " + a + " va " + b +" la: " + c1.UCLN( a, b));

        //Nhap vao n de kiem tra ham tinh fibonacci
        System.out.print("Nhap vao so nguyen n: ");
        int n = c1.scn.nextInt();
        //Kiem tra ham tinh fibonacci
        System.out.print("Fibonacci cua so nguyen n la: ");
        System.out.println( c1.Fibonacci( n ));

        //
        //
        //


    }
}
