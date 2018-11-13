package lab10;

import java.util.Random;

public class Bubbsort {
    public static void sort(int[] a, int n)
    {
        boolean sss ;
        for(int i=0; i<n-1; i++)
        {
            sss = false;
            for(int j=0; j< n-i-1; j++)
            {
                if(a[j] >= a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    sss = true;
                }
            }
            if(sss == false)
                break;
        }
    }

    public static void main(String[] args)
    {
        Random random = new Random();
        int[] a = new int[1000];
        for(int i=0; i<1000; i++)
        {
            a[i] = random.nextInt(1000);
        }
        sort(a,1000);
        for(int i=0; i<1000; i++)
        {
            System.out.println(a[i]);
        }
    }
}
