import java.util.*;
public class ucln {
    public int ucln (int a, int b){
        int m = Math.abs(a);
        int n = Math.abs(b);
        while(m!=n){
            if (m > n) m = m - n;
            else n = n - m;
        }
        return m;
    }
    public static void main(String [] args){
        ucln k = new ucln();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(k.ucln(a, b));
    }
}
