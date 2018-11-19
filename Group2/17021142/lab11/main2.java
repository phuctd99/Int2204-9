package cau2;

import java.util.ArrayList;

public class main2 {
//    // single
//    public static class Single<T> {
//        private T data;
//
//        public Single() {
//            this.data = null;
//        }
//
//        public Single(T data) {
//            this.data = data;
//        }
//
//        public void setData(T newValue) {
//            this.data = newValue;
//        }
//
//        public T getData() {
//            return this.data;
//        }
//    }
//
//
//    // comparable
//    public interface Comparable<T> {
//        public int compareTo(T o);
//    }

    // ràng buộc kiểu
//        public static <T> T min(T[] a) // almost correct



    public static <T extends Comparable> T max(ArrayList<T> a) {
        if (a == null || a.size() == 0) return null;
        T biggest = a.get(0);
        for (int i = 1; i < a.size(); i++)
            if ( biggest.compareTo(a.get(i)) < 0)
                biggest = a.get(i);
        return biggest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            arr.add(i);
        }
        Integer a = max(arr);
        System.out.println(a);
    }

}
