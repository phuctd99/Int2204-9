
package math;
import java.util.*;
public class Math {
    //ham UCLN
    public int GCD(int a, int b) {
        if(b==0) return a;
        return GCD(b,a%b);
    }
    
    //ham Fibonacci
    public int F(int n) {
        if(n==0) {
            return 0;
        }
        else if(n==1) {
            return 1;
        }
        return F(n-1)+F(n-2);
    }
    public static void main(String[] args) {
        Math ma = new Math();
        Scanner input = new Scanner(System.in);
        //Test ham UCLN
        System.out.println("Nhap hai so de tim UCLN ");
        int m = input.nextInt();
        int n = input.nextInt();
        System.out.println("UCLN cua hai so " +m +" va " +n +" la " +ma.GCD(m, n));
        //Test ham Fibonacci
        System.out.println("Nhap so thu tu so Fibonacci ");
        int l = input.nextInt();
        System.out.println("So Fibonacci thu " +l +" la " +ma.F(l));
        
    }
    
}
