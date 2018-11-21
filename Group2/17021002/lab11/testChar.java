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
public class testChar {
    public static void main(String[] args) {
        Template <Character> t = new Template<>();
        

        Random random = new Random();
        ArrayList<Character> integerArrayList = new ArrayList<>();
        for (int i = 0; i< 100; i ++) {
            integerArrayList.add( new Character((char) random.nextInt(127)) );
        }
        System.out.println("Xap xep ");
        t.sort(integerArrayList );
        t.printArrayList(integerArrayList);
        
        System.out.println("so lon nhat la:"+t.timMax(integerArrayList)  );
    }
}




