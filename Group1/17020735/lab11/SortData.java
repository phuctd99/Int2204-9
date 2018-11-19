/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Admin
 * @param <T>
 */
public class SortData<T extends Comparable> {

    private ArrayList<T> listData;

    public SortData() {
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

    private int partition(int left, int right) {
        T latches = listData.get(right);
        int i = left;
        for (int j = left; j < right; j++) {
            if (listData.get(j).compareTo(latches) <= 0) {
                T temp = listData.get(i);
                listData.set(i, listData.get(j));
                listData.set(j, temp);
                i++;
            }
        }
        listData.set(right, listData.get(i));
        listData.set(i, latches);
        return i;
    }

    public void quickSort(int left, int right) {
        if (left < right) {
            int pa = partition(left, right);
            quickSort(left, pa - 1);
            quickSort(pa + 1, right);
        }
    }

}
