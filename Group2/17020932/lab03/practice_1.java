
public class practice_1 {
    public void gcd(int a, int b){
        while(a!=0){
            int temp =a;
            a = b%a;
            b = temp;
        }
        System.out.println(b);
    }

    public void fibonaxi(int n){
        int a = 0, b =1, f = 0;
        int i = 0;
        switch (n){
            case 0 : f = 0;
                     break;
            case 1 : f = 1;
                     break;
            default:
                while (i<=n-2){
                    int temp = a;
                    a = b;
                    b = temp + b;
                    i++;
                }
                f=b;
                break;
        }
        System.out.println("F(" + n +") = " + f);
    }

    public static void main(String[] agrs){
        practice_1 p = new practice_1();
        p.gcd(8, 6);
        p.fibonaxi(2);
        p.fibonaxi(3);
        p.fibonaxi(4);
        p.fibonaxi(5);

    }
}
