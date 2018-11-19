import java.util.ArrayList;

/**
 * Created by CCNE on 19/11/2018.
 */
public class bai2 {
    public static <T extends Comparable<T>> T Max (ArrayList<T> arr){
        T x = arr.get(0);
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).compareTo(x) > 0){
                x = arr.get(i);
            }
        }
        return x;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        arr1.add(1);
//        arr1.add(2);
//        arr1.add(3);
//        System.out.println(Max(arr1));
//
//        ArrayList<Double> arr2 = new ArrayList<>();
//        arr2.add(1.1);
//        arr2.add(2.2);
//        arr2.add(3.3);
//        System.out.println(Max(arr2));


        ArrayList<phanso> arr3 = new ArrayList<>();
        arr3.add(new phanso(1,2));
        arr3.add(new phanso(3,2));
        arr3.add(new phanso(5,2));
        System.out.println(Max(arr3).ts + "/" + Max(arr3).ms);

    }

}
