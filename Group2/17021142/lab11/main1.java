package cau1;

import java.util.ArrayList;

public class main1 {
    /*// lớp tổng quát
    public class Pair<T> {
        public Pair() { first = null; second = null; }
        public Pair(T first, T second) {
            this.first = first; this.second = second;
        }
        public T getFirst() { return first; }
        public T getSecond() { return second; }
        public void setFirst(T newValue) { first = newValue; }
        public void setSecond(T newValue) { second = newValue; }
        private T first;
        private T second;
    }
    // thêm kiểu
    public class Pair<T, U>{
        public Pair() { first = null; second = null; }
        public Pair(T first, U second){
            this.first = first; this.second = second;
        }
        public T getFirst() { return first; }
        public U getSecond() { return second; }
        public void setFirst(T newValue) { first = newValue; }
        public void setSecond(U newValue) { second = newValue; }
        private T first;
        private U second;
    }*/

    // single
//    public class Single<T> {
//        private T data ;
//        public Single(){
//            this.data = null;
//        }
//        public Single(T data){
//            this.data = data;
//        }
//        public void setData(T newValue) { this.data = newValue; }
//        public T getData(){
//            return this.data;
//        }
//    }




    public static <T extends Comparable> void sort(ArrayList<T> a) {
        if (a == null || a.size() == 0) return ;
        for (int i = 0; i < a.size(); i++){
            for( int j = i+1; j<a.size(); j++){
                if( a.get(i).compareTo(a.get(j)) > 0 ){
                    T b = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, b);
                }
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=10; i>0; i--){
            a.add(i);
        }
        sort(a);
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
