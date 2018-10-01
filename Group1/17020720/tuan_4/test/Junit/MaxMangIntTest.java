package Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMangIntTest {

    @Test
    public void maxArr() {
        int arr1[] = {1, 2, 3, 4, 5};
        int maxResult1 = 5;
        int maxJuint1 = MaxMangInt.MaxArr(arr1);
        assertEquals(maxJuint1, maxResult1);
        System.out.println("True");

        int arr2[] = {3, 5, 11, 7, 9};
        int maxResult2 = 11;
        int maxJuint2 = MaxMangInt.MaxArr(arr2);
        assertEquals(maxJuint2, maxResult2);
        System.out.println("True");

        int arr3[] = {10, 2, 4, 6, 8};
        int maxResult3 = 10;
        int maxJuint3 = MaxMangInt.MaxArr(arr3);
        assertEquals(maxJuint3, maxResult3);
        System.out.println("true");

        int arr4[] = {3, 6, 9, 12, 15};
        int maxResult4 = 15;
        int maxJuint4 = MaxMangInt.MaxArr(arr4);
        assertEquals(maxJuint4, maxResult4);
        System.out.println("True");

        int arr5[] = {4, 8, 5, 6, 7};
        int maxResult5 = 8;
        int maxJuint5 = MaxMangInt.MaxArr(arr5);
        assertEquals(maxJuint5, maxResult5);
        System.out.println("True");
    }
}