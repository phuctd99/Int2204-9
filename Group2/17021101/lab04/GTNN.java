package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class GTNN {
    private  Main a = new Main();
    private int i;
    @Test public void test() {
        int a1[] = {1, 2, 3};
         i = a.GTNN(a1);
        assertEquals(1, i);
    }
     @Test public void test2() {
         int a2[] = {1, 2, 3, 4, 5, 6};
         i = a.GTNN(a2);
         assertEquals(1, i);
     }
     @Test public void test3() {
         int a3[] = {3, 4, 6, 98, 12, 0};
         i = a.GTNN(a3);
         assertEquals(0, i);
     }
     @Test public void test4() {
         int a4[] = {3, 4, 6, 98, 12, 655, 4654, 54654, 6465, 6545, 654, 6541, 12, 20, 212, 121, 212, 1, 21, 2, 12, 2};
         i = a.GTNN(a4);
         assertEquals(1, i);
     }
    @Test public void test5() {
        int a5[] = {3,4,6,98,12,0,564654,-6546,5465,132,1,32,320,321,21,3,2,3132,1,321,321,51,321,32,132,132,1,321,321,30,32,132,46,1,3,13,24,21};
        i=a.GTNN(a5);
        assertEquals(-6546,i);
    }
}