/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 * @param <T>
// */
public class FindMaxData<T extends Comparable>{
    private ArrayList<T> listData;
    public FindMaxData() {
        listData = new ArrayList<>();
    }
        public void add(T t) {
        listData.add(t);
    }

    public int size() {
        return listData.size();
    }

    public T get(int i) {
        return listData.get(i);
    }
        public void remove(int i) {
        listData.remove(i);
    }
    public void remove(T t) {
        listData.remove(t);
    }
    public T getMax() {
        if (listData.size() == 0)
            return null;
        else {
            T max = listData.get(0);
            for(int i = 1; i < listData.size(); i++) {
                if (listData.get(i).compareTo(max) > 0) {
                    max = listData.get(i);
                }
            }
            return max;
        }
    }
}
