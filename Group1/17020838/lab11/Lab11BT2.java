package lab11bt2;

import java.util.ArrayList;
public class Lab11BT2 {

    public static <T extends Comparable> T maxValue(ArrayList<T> a) {
        if (a.isEmpty()) return null;
        T max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).compareTo(max) > 0) {
                max = a.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr1 = new ArrayList();
        int[] a = {-5, 9, 6, 10, 0, 20, -9, 15};
        for (int i = 0; i < a.length; i++) {
            arr1.add(a[i]);
        }
        
        int max1 = maxValue(arr1);
        System.out.println(max1);
        ArrayList <Double> arr2 = new ArrayList();
        double[] b = {-5.2, 9.6, 6.0, 10.98, 0, 13.13, -9, 15.0, 10.97};
        for (int i = 0; i < b.length; i++) {
            arr2.add(b[i]);
        }
        double max2 = maxValue(arr2);
        System.out.println(max2);
    }
    
}
