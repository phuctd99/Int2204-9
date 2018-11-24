import java.util.ArrayList;
import java.util.Random;

public class Lab11 {
    public static <T extends Comparable<T>> void sort(T[] a) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                if(a[i].compareTo(a[j]) > 0) {
                    T tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }


    public static <T extends Comparable<T>> T findMax(ArrayList<T> list) {
        T max = list.get(0);
        for (int i=0; i<list.size(); i++) {
            if(max.compareTo(list.get(i)) < 0)   max = list.get(i);
        }
        return max;
    }

    public static <T> void printArr(T[] a) {
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        ArrayList<Double> tmp1 = new ArrayList<>();
        tmp1.add(12.3);
        tmp1.add(16.23);
        tmp1.add(2.23);
        tmp1.add(1.34);
        tmp1.add(17.24);
        tmp1.add(4.56);
        System.out.println(findMax(tmp1));


        Integer[] a = new Integer[10];
        Random rd = new Random();
        for(int i=0; i<a.length; i++) {
            a[i] = rd.nextInt(60);
        }

        sort(a);
        printArr(a);

        Phan_So[] ps = new Phan_So[10];
        for(int i=0; i<ps.length; i++) {
            ps[i] = new Phan_So(rd.nextInt(10)+1, rd.nextInt(10)+1).reduction();
        }

        System.out.println();
        sort(ps);
        for(int i=0; i<ps.length; i++) {
            System.out.print(ps[i].ts + "/" + ps[i].ms + " ");
        }

    }
}
