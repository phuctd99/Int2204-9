import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class lab11 {
    public static <X extends Comparable> void sort(ArrayList<X> arr){
        if(arr== null || arr.size() ==0){
            return;

        }
        for (int i = 0; i < arr.size(); i++){
            for( int j = i+1; j<arr.size(); j++){
                if( arr.get(i).compareTo(arr.get(j)) > 0 ){
                    X b = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, b);
                }
            }
        }

    }
    public static <T extends Comparable> T Max(ArrayList<T> arr) {
        if (arr == null || arr.size() == 0) return null;
        T max = arr.get(0);
        for (int i = 1; i < arr.size(); i++)
            if ( max.compareTo(arr.get(i)) < 0)
                max = arr.get(i);
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=10; i>0; i--){
            arr.add(i);
        }
        sort(arr);
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        Integer a = Max(arr);
        System.out.println(a);
        ArrayList<PhanSo> Ps= new ArrayList<PhanSo>();
        Ps.add(new PhanSo(1,5));
        Ps.add(new PhanSo(1,3));
        Ps.add(new PhanSo(1,2));
        Ps.add(new PhanSo(1,10));
        sort(Ps);
        for(PhanSo ps : Ps){
            System.out.println(ps.toString()+ "  ");
        }
        System.out.println(Max(Ps).toString());

    }

}

