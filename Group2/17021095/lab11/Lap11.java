/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author CCNE
 */
public class Lap11 {

    /**
     * @param args the command line arguments
     */
 
 
    
    public static<E extends Comparable> void Sort(ArrayList<E> arr){
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i).compareTo(arr.get(j)) >0 ){
                    Collections.swap(arr,i,j);
                }
            }
        }
    }
    
    public static<E extends Comparable> E Emax(ArrayList<E> arr){
        E max = arr.get(0);
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i).compareTo(max)>0){
                max = arr.get(i);
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PS> arr = new ArrayList();
        arr.add(new PS(3,5));
        arr.add(new PS(4,5));
        arr.add(new PS(7,6));
        arr.add(new PS(8,5));
        Sort(arr);
        for(PS i : arr){
            i.In();
             System.out.println();
        }
        
        
    }
    
}
