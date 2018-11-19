
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class lab11 {
    // sap xep
    public static <T extends Comparable<T>> void sort(ArrayList<T> arr){
          for(int i=0;i < arr.size();i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i).compareTo(arr.get(j)) > 0){
                    T a = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, a);
                }
            }
        }
    }
    
    // GTLN
     public static <T extends Comparable<T>> T Max(ArrayList<T> arr){
                 T max = arr.get(0);
            for(int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(max) > 0) {
                    max = arr.get(i);
                }
            }
            return max;
     }
    
    public static void main(String [] agrs){
              //Integer
                ArrayList<Integer> a = new ArrayList<Integer>();
                a.add(3);
                a.add(7);
                a.add(15);
                a.add(1);
                sort(a);
                 for(int i =0 ; i<a.size() ; i++){
                     System.out.print(a.get(i) +" ");
                 }
                 System.out.println();
                 int max1 = Max(a);
                 System.out.println("GTLN : " +max1);
                 //Chacracter
                ArrayList<Character> b = new ArrayList<>();
                b.add('d');
                b.add('a');
                b.add('c');
                b.add('v');
                sort(b);
                 for(int i =0 ; i<a.size() ; i++){
                     System.out.print(b.get(i) +" ");
                 }
                 System.out.println();
                 char max2 = Max(b);
                 System.out.println("GTLN : " +max2);
                 
                 //ps
                 ArrayList<PS> ps = new ArrayList<>();
                 ps.add( new PS(1,2)) ;
                 ps.add( new PS(1,3)) ;
                 ps.add( new PS(3,4)) ;
                 ps.add( new PS(1,7)) ;
                 ps.add( new PS(1,9)) ;
                 PS max = Max(ps);
                 sort(ps);
                 for(int i =0 ; i<ps.size() ; i++){
                     System.out.print(ps.get(i).tuSo +"/"+ps.get(i).mauSo + " " );
                 }
                 System.out.println();
                 System.out.print("GTLN cua mang PS :" +max.tuSo +"/"+max.mauSo ); 
    }
}
