import java.util.*;

public class Main {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> T max(T[] arr) {
        T temp = arr[0];
        for (T t : arr) {
            if (temp.compareTo(t) < 0) {
                temp = t;
            }
        }
        return temp;
    }

    public static <T extends Comparable<T>> T max(ArrayList<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        T temp = list.get(0);
        for (T t : list) {
            if (temp.compareTo(t) < 0) {
                temp = t;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        Main.sort(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer integer = random.nextInt(100);
            System.out.print(integer + " ");
            list.add(integer);
        }
        System.out.println();
        System.out.println(Main.max(list));


        PS[] ps = new PS[10];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new PS(random.nextInt(10), random.nextInt(10) + 1);
        }
        Main.sort(ps);
        for (PS temp : ps) {
            System.out.println(temp);
        }
    }
}
