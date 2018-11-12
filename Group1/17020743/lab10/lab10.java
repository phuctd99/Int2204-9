import sun.awt.geom.AreaOp;

import java.util.Random ;
import java.util.Scanner ;
public class lab10 {
    public static void main(String[] args) {
        double array[] = new double[1000];
        Random random = new Random() ;
        for (int i = 0 ; i < 1000 ; i++) {
            array[i] = random.nextDouble() ;
        }
        bubblesort(array);
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println(array[i]);
        }

        }
        public static void bubblesort (double[] array) {
        int n = array.length ;
        double tempSort = 0 ;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    tempSort = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tempSort;
                }
            }
        }

        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
