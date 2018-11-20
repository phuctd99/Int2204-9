
import java.util.ArrayList;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class cau2_lab11 {

    public static <T extends Comparable> T max(ArrayList<T> arr) {
        T maximum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).compareTo(maximum) > 0) {
                maximum = arr.get(i);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        
        ArrayList<Character> list_char = new ArrayList<>();
        list_char.add('a');
        list_char.add('+');
        list_char.add('b');
        
        
        System.out.println(max(list_char));

    }

}
