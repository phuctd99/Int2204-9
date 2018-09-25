import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Fibonaxi {
     public int fibonaxi(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Fibonaxi fb = new Fibonaxi();
        int n = sc.nextInt();
        System.out.println(fb.fibonaxi(n));
    }
}

