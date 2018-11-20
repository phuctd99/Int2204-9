/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.ArrayList;

/**
 *
 * @author CACLV
 * @param <T>
 */
public class Ex2<T extends Comparable> {

    private final ArrayList<T> arr;
    private T mx;
    private int tmp = 0;
    
    public Ex2(){
        arr = new ArrayList<>();
    }
    public ArrayList<T> getArr() {
        return arr;
    }

    public void add(T t) {
        arr.add(t);
        if(tmp == 0){
            mx = t;
            tmp++;
        }
        else if (mx.compareTo(t) <= -1) {
            mx = t;
        }
    }

    public T maxValue() {
        return mx;
    }

    public static void main(String[] args) {
        Ex2<Character> listShort = new Ex2<>();
        listShort.add('d');
        listShort.add('e');
        listShort.add('k');
        listShort.add('K');
        System.out.println(listShort.maxValue() + "\n");
        listShort.getArr().forEach(System.out::println);
    }
}
