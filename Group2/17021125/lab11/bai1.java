import java.util.IntSummaryStatistics;

/**
 * Created by CCNE on 19/11/2018.
 */

public class bai1 {
    public static < T extends Comparable <T>> void sort (T [] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    T x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
    }

    public static < T > void printArray( T[] inputArray )
    {
        // Hien thi cac phan tu mang
        for ( T element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*Integer [] arr1 = {1,2,4,3};
        sort(arr1);
        printArray(arr1);

        Double [] arr2 = {1.1, 3.3, 2.2};
        sort(arr2);
        printArray(arr2);*/
        phanso[] ps ={new phanso(1,2), new phanso(3,2),new phanso(1,3),new phanso(5,2),new phanso(2,3)};
        sort(ps);
        for(phanso x : ps){
            System.out.println(x.ts + "/" + x.ms);
        }
    }
}

