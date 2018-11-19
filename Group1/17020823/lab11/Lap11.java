/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11;

import java.util.ArrayList;

/**
 *
 * @author Hoang Vu Huong
 */
public class Lap11<O extends Comparable> {

    /**
     * @param args the command line arguments
     */
     private ArrayList<O> List;

    public Lap11() {
        List = new ArrayList<>();
    }

    public void add(O t) {
        List.add(t);
    }

    public int size() {
        return List.size();
    }

    public O get(int i) {
        return List.get(i);
    }

    private int partition(int l, int r) {
        O latches = List.get(r);
        int i = l;
        for (int j = l; j < r; j++) {
            if (List.get(j).compareTo(latches) <= 0) {
                O temp = List.get(i);
                List.set(i, List.get(j));
                List.set(j, temp);
                i++;
            }
        }
        List.set(r, List.get(i));
        List.set(i, latches);
        return i;
    }

    public void quickSort(int l, int r) {
        if (l < r) {
            int pa = partition(l, r);
            quickSort(l, pa - 1);
            quickSort(pa + 1, r);
        }
    }
    public static void main(String[] args) {
        Lap11<Integer> l = new Lap11<>();
        l.add(4);
        l.add(2);
        l.add(9);
        l.add(5);
        l.quickSort(0, l.size()-1);
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }
    }
}
