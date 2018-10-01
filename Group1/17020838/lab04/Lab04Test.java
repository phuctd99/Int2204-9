package lab04;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class Lab04Test {
        @Test
        public void testMax() {
           Lab04 test = new Lab04();
           int a1 = 5;
           int b1 = 3;
           int max1 = test.max(a1, b1);
           assertEquals(5, max1);
           int a2 = 3;
           int b2 = 3;
           int max2 = test.max(a2, b2);
           assertEquals(3, max2);
           int a3 = -5;
           int b3 = -3;
           int max3 = test.max(a3, b3);
           assertEquals(-3, max3);
           int a4 = 2;
           int b4 = -4;
           int max4 = test.max(a4, b4);
           assertEquals(2, max4);
           int a5 = -9;
           int b5 = 0;
           int max5 = test.max(a5, b5);
           assertEquals(0, max5);
        }
        @Test
        public void testMin(){
            Lab04 test = new Lab04();
            int[] a1 = new int[3];
            a1[0] = 1; a1[1] = 0; a1[2] = 9;
            assertEquals(0, test.min(a1, 3));
            int[] a2 = new int[5];
            a2[0] = -3; a2[1] = 6; a2[2] = 99; a2[3] = -57; a2[4] = 15;
            assertEquals(-57, test.min(a2, 5));
            int[] a3 = new int[1];
            a3[0] = 1;
            assertEquals(1, test.min(a3, 1));
            int[] a4 = new int[10];
            a4[0] = 100; a4[1] = 63; a4[2] = -10; a4[3] = 0; a4[4] = -15; 
            a4[5] = 27; a4[6] = 13; a4[7] = 1; a4[8] = 36; a4[9] = -15; 
            assertEquals(-15, test.min(a4, 10));
            int[] a5 = new int[15];
            a5[0] = 9; a5[1] = 5; a5[2] = 6; a5[3] = 19; a5[4] = 36;
            a5[5] = 19; a5[6] = 5; a5[7] = 9; a5[8] = 9; a5[9] =23;
            a5[10] = 37; a5[11] = -13; a5[12] = 0; a5[13] = -26; a5[14] = -13;
            assertEquals(-26, test.min(a5, 15));
        }
        @Test
        public void testBMI(){
            Lab04 test = new Lab04();
            double a1 = 53.465, b1 = 1.7; // BMI = 18.5
            assertEquals("Binh thuong", test.BMI(a1, b1));
            double a2 = 45, b2 = 1.68;
            assertEquals("Thieu can", test.BMI(a2, b2));
            double a3 = 64, b3 = 1.65;
            assertEquals("Thua can", test.BMI(a3, b3));
            double a4 = 68, b4 = 1.65;
            assertEquals("Thua can", test.BMI(a4, b4));
            double a5 = 90, b5 = 1.7;
            assertEquals("Beo phi", test.BMI(a5, b5));
            double a6 = 62.6175, b6 = 1.65; // 23
            assertEquals("Thua can", test.BMI(a6, b6));
        }
    
}
