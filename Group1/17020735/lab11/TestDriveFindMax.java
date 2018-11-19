/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.File;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class TestDriveFindMax {
    public static void main(String[] args) {
        FindMaxData<Integer> findMaxData = new FindMaxData<>();
        for (int i = 0; i < 10; i++) {
            findMaxData.add(new Random().nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(findMaxData.get(i));
        }
        System.out.println("Max " + findMaxData.getMax());
        
    }
}
