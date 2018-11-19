import java.util.*;

public class Bai2 {

    public static <T extends Comparable> T Max(ArrayList<T> arr) {
        T max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).compareTo(max) > 0) max = arr.get(i);
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(0);
        list1.add(4);
        System.out.println(Max(list1));

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(4.67);
        list2.add(3.45);
        list2.add(5.69);
        list2.add(2.0);
        System.out.println(Max(list2));
    }
}

