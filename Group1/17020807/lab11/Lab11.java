/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Lab11 {
    public static <T extends Comparable<T>> T maximum(ArrayList<T> a){
       T max =  a.get(0);
       for(int i = 0; i < a.size(); i++){
           if(a.get(i).compareTo(max) > 0){
               max = a.get(i);
           }
       }
       return max;
    }
    
    public static <T extends Comparable<T>> T[] sort(T[] a){
        
        for(int i = 1; i < a.length; i++){
           for (int j = 0; j < i; j++){
               if(a[i].compareTo(a[j]) > 0){
                   T x = a[j];
                   a[j] = a[i];
                   a[i] = x;
               }
           }
       }
       return a;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("pnh");
        a.add("jshf");
        a.add("hfkbs");
        a.add("amvf");
        a.add("ssp");
        a.add("san");
       // maximum(a);
        
        String[] s = new String[a.size()];
        for (int k = 0; k < a.size(); k++){
            s[k] = a.get(k);
        }
        sort(s);
        System.out.print("Câu a: ");
        for(int j = 0; j < a.size(); j++){
            System.out.print(s[j] +" ");
        }
        
        System.out.println("\nCâu b: " + maximum(a));
        
        // TODO code application logic here
    }
    
}
