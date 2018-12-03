/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Arrays;

/**
 *
 * @author CCNE
 */
public class StrategyTestDrive {
    public static void main(String[] args) {
        int arr[] = {4,8,2,7,2,3,5};
        int arr1[] = {5,7,2,47,2};
        Context context = new Context(new SelectionSort());
        context.executeStrategy(arr);
        Context context1 = new Context(new BubbleSort());
        context1.executeStrategy(arr1);

        System.out.println(Arrays.toString(arr));
        System.out.println("---------");
        System.out.println(Arrays.toString(arr1));
    }
}
