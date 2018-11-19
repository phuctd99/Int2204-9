/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author CCNE
 */
public class Sapxep<T extends Comparable<T>> {

    /**
     * @param args the command line arguments
     */
    private ArrayList<T> items = new ArrayList<T>();
    public void add(T item) {
      items.add(item);
   }
    public void sort (){
       for (int i=0; i< items.size(); i++){
          for (int j = i+1; j< items.size(); j++){
             if ( items.get(i).compareTo(items.get(j)) > 0){
                 T temp ;
                 temp = items.get(i);
                 items.set(i,items.get(j));
                 items.set(j, temp);
             }
          }
       }
    }
    public void printItems() {
        for ( int i= 0; i< items.size(); i++){
            System.out.println(items.get(i));
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
          Sapxep<Integer> sapxep = new Sapxep();
          for (int i = 0; i < 5; i++) {
              sapxep.add(new Random().nextInt());
          }
          sapxep.sort();
          sapxep.printItems();
    }
    
}
