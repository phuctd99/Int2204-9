import java.util.Scanner;

public class tuan3 {
    
    public static int UCLN(int a, int b)
    {
        if(b == 0) return a;
        return UCLN( b, a%b );
    }
    
    public void Fibonaxi(int n)
    {
        int n1=0,n2=1;
        int n3;
        System.out.print(n1 +" " + n2);
        for(int i=2 ; i<n ; i++)
        {
            n3=n1+n2;
            System.out.print( n3 + " ");
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        tuan3 dinh = new tuan3();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = input.nextInt();
        System.out.println("nhap so b");
        int b = input.nextInt();
        int c =UCLN(a, b);
        System.out.println("UCLN cua a va b la: "+ c);
        System.out.println("nhap vao so n");
        int n = input.nextInt();
        System.out.println("day fibonaxi cua so n la: " );
        dinh.Fibonaxi(n);
    }
}


