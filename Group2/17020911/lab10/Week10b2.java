/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10b2;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class Week10b2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Float arr[]=new Float[1000];
        Random rd = new Random();
        for(int i=0;i<1000;i++)
        {
            arr[i]=rd.nextFloat();
        }
        for(int i=0;i<999;i++)
        {
            for(int j=i+1;j<1000;j++)
            {
                if(arr[i]>arr[j])
                {
                    Float temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<1000;i++) System.out.println(arr[i]);
    }
    
}
