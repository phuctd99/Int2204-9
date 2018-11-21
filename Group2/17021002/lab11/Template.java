/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this Template file, choose Tools | Templates
 * and open the Template in the editor.
 */
package lap11;
import java.util.ArrayList;
/**
 *
 * @author VIETTEL
 */
public class Template <Comparable>{
     public static  <E> void  swap(ArrayList<E> list, int i, int j )  {
        E tmp = list.get(i);
        list.set(i, list.get(j) );
        list.set(j, tmp );
    }

    public <E extends java.lang.Comparable<E> > void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++ ) {
            for (int j = i+1; j< list.size(); j++)
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    swap(list, i , j);
                }
        }

    }

    public <E> void printArrayList( ArrayList<E> list ) {
        for ( E s: list) {
            System.out.printf("%s " , s);
        }
        System.out.println();
    }

    public <E extends java.lang.Comparable<E> > E timMax(ArrayList<E> list ) {
        E max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if( list.get(i).compareTo( max ) > 0 ) max = list.get(i);
        }
        return max;
    }

}
