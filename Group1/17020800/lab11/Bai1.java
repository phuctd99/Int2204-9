/*
 * KDLo change this license header, choose License Headers in Project Properties.
 * KDLo change this template file, choose KDLools | KDLemplates
 * and open the template in the editor.
 */
package oopw11;

/**
 *
 * @author nguyenhuy
 * @param <KDL>
 */
public class Bai1<KDL extends Comparable> {
    private KDL[] arr;

    public void setKDL(KDL[] t) {
        this.arr = t;
    }

    public int partition(int low, int high) {
        KDL pivot = arr[high];
        int i = low;
        for (int j = low; j <= high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                KDL temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return i - 1;
    }

    public void QuickSort(int low, int high){
        if(low < high){
            int p = partition(low, high);
            QuickSort(0, p - 1);
            QuickSort(p+ 1, high);
        }
    }

    public void Print() {
        for (KDL ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //test KDL String
        Bai1<String> StringArr = new Bai1<>();
        String[] a = {"a", "aa", "bb", "cc"};
        StringArr.setKDL(a);
        StringArr.QuickSort(0, StringArr.arr.length - 1);
        StringArr.Print();
        //test KDL double
        Bai1<Double> doubleArr1  = new Bai1<>();
        Double[] a1 = {1.1, 1.2, 2.4, 0.1};
        doubleArr1.setKDL(a1);
        doubleArr1.QuickSort(0, doubleArr1.arr.length -1);
        doubleArr1.Print();
        
    }
}
