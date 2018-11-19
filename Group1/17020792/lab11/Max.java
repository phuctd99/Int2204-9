
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class Max<T extends Comparable>{
    private ArrayList<T> listData;
    public Max() {
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
     public static void main(String[] args) {
        Max<Integer> findMax = new Max<>();
        for (int i = 0; i < 10; i++) {
            findMax.add(new Random().nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(findMax.get(i));
        }
        System.out.println("Gia tri lon nhat cua mang la : " + findMax.getMax());
    }
}
