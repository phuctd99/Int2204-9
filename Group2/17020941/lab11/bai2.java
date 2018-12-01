import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class bai2 {

    public static <E extends Comparable<E>> E findMax(ArrayList<E> list) {
        E max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrInts = new ArrayList<>();
        arrInts.add(1);
        arrInts.add(2983);
        arrInts.add(-1392);
        arrInts.add(38928);
        arrInts.add(0);
        System.out.println(findMax(arrInts));

        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("ac");
        arrString.add("usi");
        arrString.add("li");
        arrString.add("wwww");
        System.out.println(findMax(arrString));
    }

}
