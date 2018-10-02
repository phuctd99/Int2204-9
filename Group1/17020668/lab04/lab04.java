
package lab04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;



public class lab04 {
   static Scanner sc = new Scanner(System.in);

    public static int max(int a, int b){
        if (a >= b) return a;
        else return b;
    }

    public static int min(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }

    public static String IBM(double height, double weight){
        double ibm = weight / (height * height);
        if (ibm > 25)
            return "Béo phì";
        else
        if (ibm > 23)
            return "Thừa cân";
        else
        if (ibm >=18.5)
           return "Bình thường";
        else
            return "Thiếu cân";

    }
}



