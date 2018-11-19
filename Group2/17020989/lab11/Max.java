/**
 * Created by CCNE on 19/11/2018.
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Max {
    public static <M extends Comparable> M max (ArrayList<M> arr) {
        M max = arr.get(0);
        for(int i = 1 ;i < arr.size() ; i++) {
            if(max.compareTo(arr.get(i)) < 0) max = arr.get(i);
        }

        return max;
    }



    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(11);
        arr.add(1999);
        arr.add(1998);
        System.out.print(max(arr));

    }

}

