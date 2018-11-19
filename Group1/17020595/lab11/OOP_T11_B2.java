package oop_t11_b2;

import java.util.ArrayList;

public class OOP_T11_B2<T extends Comparable> {

    private final ArrayList<T> arr;
    private T max;
    private int tmp = 0;
    public OOP_T11_B2(){
        arr = new ArrayList<>();
    }
    public ArrayList<T> getArr() {
        return arr;
    }

    public void add(T t) {
        arr.add(t);
        if(tmp == 0){
            max = t;
            tmp++;
        }
        else if (max.compareTo(t) <= -1) {
            max = t;
        }
    }

    public T maxValue() {
        return max;
    }

    public static void main(String[] args) {
        OOP_T11_B2<String> list = new OOP_T11_B2<>();
        list.add("a");
        list.add("dsa");
        list.add("bb");
        list.add("abds");
        System.out.println(list.maxValue());
    }
    
}
