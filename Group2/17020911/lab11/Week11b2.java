/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11b2;

/**
 *
 * @author Admin
 */
public class Week11b2 {

    /**
     * @param args the command line arguments
     */
    public static <E extends Comparable<E>> E max(E[] list)
    {
        E max=list[0];
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
        String[] listStrings = {"huy","hau","hieu","hoang","nam","tien"};
        Double[] listDoubles = {1.2,2.3,1.5,9.1,2.7};
        PS[] listPS = new PS[4];
        listPS[0]=new PS(1,2);
        listPS[1]=new PS(3,4);
        listPS[2]=new PS(1,5);
        listPS[3]=new PS(7,5);
        System.out.println(max(listInteger));
        System.out.println(max(listStrings));
        System.out.println(max(listDoubles));
        max(listPS).print();
    }
    
}
