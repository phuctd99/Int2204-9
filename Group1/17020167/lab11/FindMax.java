/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FindMax {

    public<X extends Comparable> X maxarr(X[]a) {
        X max = a[0];
        for(int i=1; i<a.length; i++) {
            if(max.compareTo(a[i])<0)
                max = a[i];
        }
        return max;
    } 
    public static void main(String[] args) {
        FindMax newFindMax = new FindMax();
        Integer[] integ = new Integer[5];
        
        Character[] cha = new Character[5];
        for(int i = 0; i < 5; i++){
            integ[i] = 50 - i;
            
            cha[i] = (char)(98 - i);
            
        }
        System.out.println(newFindMax.maxarr(cha));
        System.out.println(newFindMax.maxarr(integ));
       
        
    }
    
    
}
