import java.util.Scanner;

public class bai1 {
    /* ham tim uoc chung lon nhat*/

    public  int findUCLN(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;

    }
    /* ham fibonaxi*/

    public void findFiob(int n){
        int[] mang = new int[n];
        n = mang.length;
        mang[0] = 0 ;
        mang[1] = 1 ;
        for(int i = 2 ; i < n ; i++ ){
            mang[i] = mang[i-1]+mang[i-2];
        }
        System.out.println(mang[n-1]);
    }

    public static void main(String args[]) {
        bai1 test1 = new bai1();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(test1.findUCLN(a,b));
        test1.findFiob(5);
    }
}
