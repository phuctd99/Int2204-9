/*
  String [] string = { "hoc sinh" , "giao vien"};
        sort(string);
        System.out.println(Arrays.toString(string));
 */
package generic;

import java.util.Arrays;

/**
 *
 * @author CCNE
 */
public class Generic {

  public static <E extends Comparable > void sort(E[] arr) {
      for(int i = 0 ; i < arr.length -1 ; i++) {
          for(int j = i+1 ; j < arr.length ; j++) {
              if(arr[i].compareTo(arr[j]) > 0) {
                  E tam = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tam;
              }
          }
      }
  }
  
    public static void main(String[] args) {
       Integer [] a = {3,2,1,16};
       sort(a);
        for(int i = 0 ; i < a.length;i++) {
            System.out.print(a[i]+" ");
        }  
       
         
    }

    
    
}
