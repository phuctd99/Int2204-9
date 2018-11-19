/**
 * Created by CCNE on 19/11/2018.
 */
import java.util.ArrayList;
import java.util.Collections;


public class B1 {
    public static <T extends Comparable<T>> void sort(ArrayList<T> a) {
        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a.get(i).compareTo(a.get(j)) > 0) {
                    Collections.swap(a, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<phanSo> a = new ArrayList<>();
        a.add(new phanSo(3, 7));
        a.add(new phanSo(3, 2));
        a.add(new phanSo(2, 11));
        a.add(new phanSo(1, 2));
        a.add(new phanSo(1, 4));

        sort(a);

        for (phanSo x : a) {
            x.inPS();
        }
    }
}


