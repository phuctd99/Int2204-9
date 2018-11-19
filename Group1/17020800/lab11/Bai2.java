/*
 * KDLo change this license header, choose License Headers in Project Properties.
 * KDLo change this template file, choose KDLools | KDLemplates
 * and open the template in the editor.
 */
package oopw11;

import java.util.ArrayList;

/**
 *
 * @author nguyenhuy
 * @param <KDL>
 */
public class Bai2<KDL extends Comparable> {
    private final ArrayList<KDL> arr;
    private KDL max;
    private int tmp = 0;
    public Bai2(){
        arr = new ArrayList<>();
    }
    public ArrayList<KDL> getArr() {
        return arr;
    }

    public void add(KDL t) {
        arr.add(t);
        if(tmp == 0){
            max = t;
            tmp++;
        }
        else if (max.compareTo(t) <= -1) {
            max = t;
        }
    }
    public void Print() {
        arr.forEach((ele) -> {
            System.out.print(ele + " ");
        });
        System.out.println();
    }

    public KDL maxValue() {
        return max;
    }

    public static void main(String[] args) {
        Bai2<String> listString = new Bai2<>();
        listString.add("a");
        listString.add("aa");
        listString.add("bb");
        listString.add("cc");
        System.out.println(listString.maxValue());
        listString.Print();
    }
}
