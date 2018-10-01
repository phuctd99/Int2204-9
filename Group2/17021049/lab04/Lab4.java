
package lab4;

/**
 *
 * @author Pham Van Thuan
 */
public class Lab4 {

   //Ham tim gia tri nho nhat cua mang so nguyen

   public static int Min(int[] a, int n) {
       int min = Integer.MAX_VALUE;
       for(int i=0; i<n; i++){
           if(a[i]<min)   min = a[i];
       }
       return min;
    }
    
    //Ham tim gia tri lon nhat cua 2 so nguyen

    public static int Max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    
    //Ham tinh chi so BMI    
    
    public static void BMI(double weigh, double height){
        double bMI = weigh / (height * height);
        if(bMI < 18.5)  System.out.println("Thieu can");
        else if(bMI >= 18.5 && bMI < 22.99)  System.out.println("Binh thuong");
        else if(bMI >= 22.99  && bMI <= 24.99)  System.out.println("Thua can");
        else   System.out.println("Beo phi");
    }

}
