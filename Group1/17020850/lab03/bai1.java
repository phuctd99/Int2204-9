public class bai1 {
    public  int UCLN(int a,int b)
    {
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0)
        {
            return (a+b);
        }
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
                b=b-a;
        }
        return a;
    }
    public  int fibonaxi(int n)
    {
        /*
        if(n<=2)
        {
            return n;
        }
        return fibonaxi(n-1)+fibonaxi(n-2)
         */
        int a=0;
        int b=0;
        int fi=1;
        for(int i=0;i<n-1;i++)
        {
            if(n<=1)
            {
                fi=n;
            }
            else {
                a = b;
                b = fi;
                fi = a + b;

            }
        }
        return fi;
    }

    public static void main(String[] args) {
        bai1 sm= new bai1();
        int a=8;
        int b=-2;
        int n=5;
        System.out.println("UCLN : "+ sm.UCLN(a,b));
        System.out.println("Fibonaxi cua so n : "+sm.fibonaxi(n));

    }
}
