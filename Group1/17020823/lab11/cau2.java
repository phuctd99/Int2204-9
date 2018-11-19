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
public class cau2<O extends Comparable> {
     private ArrayList<O> List;
    public cau2() {
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
    public O getMax() {
        if (List.size() == 0)
            return null;
        else {
            O _MAX = List.get(0);
            for(int i = 1; i < List.size(); i++) {
                if (List.get(i).compareTo(_MAX) > 0) {
                    _MAX = List.get(i);
                }
            }
            return _MAX;
        }
    }
    public static void main(String[] args) {
        cau2<Integer> l = new cau2<>();
        l.add(4);
        l.add(2);
        l.add(9);
        l.add(5);
        System.out.println(l.getMax());
    }
}
