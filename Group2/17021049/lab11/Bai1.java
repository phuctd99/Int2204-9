import java.util.*;

public class Bai1 {

    public static <T extends Comparable> void sortArray(T[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (T x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        String[] str = {"Hello", "Money", "All", "best"};
        Integer[] num = {4, 6, 2, 1};
        sortArray(str);
        sortArray(num);
    }
}
