/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

public class main {

    
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,7,3};
        int[] brr = {3,5,4,2,7,9,10,13};
//        Context context = new Context(new bubble_sort());
//        context.doing(arr);
        
        Context context1 = new Context(new selection_sort());
        context1.doing(brr);
        
    }
    
}
