package lab03bt1;
import java.util.*;
public class Lab03BT1 {

    public int gcd(int a, int b){ // ham tinh uoc chung lon nhat 2 so a, b 
        if (b == 0) { 
            return a; // tra ve a neu b = 0
        }
        else {
            return gcd(b , a % b); // nguoc lai tra ve ucln cua b va phan du a 
                                   //  chia b 
        }
    }
    public int fibo(int n){ // ham tinh fibnaci cua so nguyen n
        if (n == 0){
            return 0; // tra ve 0 neu n = 0
        }
        else if (n == 1){
            return 1; // tra ve 1 neu n = 1
        }
        else return fibo(n - 1) + fibo(n - 2); // nguoc lai tra ve tong fibonaci
                                               // cua n - 1 va n -2
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // tao doi tuong input de doc du
                                                // lieu vao
        Lab03BT1 test = new Lab03BT1(); // tao doi tuong test de test cac ham
        int a, b; // tao hai bien a, b de test ham tinh ucln;
        System.out.println("Nhap a, b:");
        a = input.nextInt(); // doc vao gia tri bien a
        b = input.nextInt(); // doc vao gia tri bien b
        System.out.println("UCLN cua a, b la:" + test.gcd(a,b)); // in ucln a,b
        int n; // tao bien n de test ham fibonaci
        System.out.println("Nhap n:");
        n = input.nextInt(); // doc vao gia tri bien n
        System.out.println("F(" + n + ") = " + test.fibo(n) ); // tinh fibnaci n
        
    }
 }       
    