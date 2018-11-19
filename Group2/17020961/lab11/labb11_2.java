/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author CCNE
 */
public class labb11_2 {
    public static <T extends Comparable<T>> T max(T[] list)
    {
        T max=list[0];
        for(int i=1;i<list.length;i++)
        {
            if(list[i].compareTo(max)>0)
            {
                max=list[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] listInteger = {1,6,3,8,2,7};
        String[] listStrings = {"abc","mnh","jhg","rtt","khg","vii"};
        System.out.println(max(listInteger));
    }
}
