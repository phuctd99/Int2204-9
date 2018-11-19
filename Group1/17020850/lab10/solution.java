import java.util.ArrayList;
import java.util.Arrays;

public class solution {
    public static <T extends Comparable<T>>  void sort(T [] A)
    {
        Arrays.sort(A);
    }
    public static <T extends Comparable<T>>  T sortmax(ArrayList<T> A)
    {
        if(A.isEmpty())
        {
            return null;
        }
        T max = A.get(0);
        for(int i =0;i<A.size();i++)
        {
            if(max.compareTo(A.get(i)) <0)
            {
                max = A.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<String> e = new ArrayList<>();
//        e.add("ab");
//        e.add("ca");
//        e.add("be");
        System.out.println(sortmax(e));
        Integer[] a = {};
        sort(a);
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i] +" ");
        }
    }

}
