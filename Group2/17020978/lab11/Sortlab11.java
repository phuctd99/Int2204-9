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
public class Sortlab11 {
    
    public <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> array)
    {
        for(int i=0; i<array.size()-1; i++)
        {
            for(int j = 0; j<array.size()-i-1; j++)
            {
                if(array.get(j).compareTo(array.get(j+1)) > 0)
                {
                    T tmp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, tmp);
                }
            }
        }
        return array;
    }
    public static void main(String[] args)
    {
        ArrayList array = new ArrayList();
        array.add(3.3);
        array.add(3.2);
        array.add(4.1);
        array.add(1.5);
        array.add(1.6);
        Sortlab11 s = new Sortlab11();
        s.sort(array);
        
             for(int i=0; i<array.size(); i++)
             {
                 System.out.println(array.get(i));
             }
    }
}
