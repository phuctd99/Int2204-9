/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11b1;

/**
 *
 * @author Admin
 */

public class Week11b1 {

    /**
     * @param args the command line arguments
     */
    
    public static <E extends Comparable<E>> void sortArray(E[] list)
    {
        for(int i=0;i<list.length-1;i++)
        {
            for(int j=i+1;j<list.length;j++)
            {
                if(list[i].compareTo(list[j])>0)
                {
                    E temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
    }
    public static <E> void printArray(E[] list)
    {
        for(E i:list)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] listIntegers = {1,6,4,8,3};
        sortArray(listIntegers);
        printArray(listIntegers);
        System.out.println("\n");
        
        String[] listStrings = {"huy","hau","hieu","hoang","nam","tien"};
        sortArray(listStrings);
        printArray(listStrings);
        System.out.println("\n");
        
        Double[] listDoubles = {1.2,2.3,1.5,9.1,2.7};
        sortArray(listDoubles);
        printArray(listDoubles);
        System.out.println("\n");
        
        PS[] listPS = new PS[4];
        listPS[0]=new PS(1,2);
        listPS[1]=new PS(3,4);
        listPS[2]=new PS(1,5);
        listPS[3]=new PS(7,5);
        sortArray(listPS);
        for(int i = 0; i < 4; i++){
            listPS[i].print();
        }
 }
    
    
}
