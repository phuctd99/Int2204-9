/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author VIETTEL
 */
public class testDouble {
   public static void main(String[] args) {
        Template <Double> t = new Template<>();
        

        Random random = new Random();
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i< 100; i ++) {
            doubleArrayList.add( random.nextDouble() );
        }
        System.out.println("Xap xep ");
        t.sort(doubleArrayList );
        t.printArrayList(doubleArrayList);
        
        System.out.println("so lon nhat la:"+t.timMax(doubleArrayList)  );
    }
}


