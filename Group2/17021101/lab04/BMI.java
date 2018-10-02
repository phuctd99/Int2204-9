package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class BMI {
    private Main a = new Main();
    private Double n,c;
    @Test
    public void test() {
        n = 60.00;
        c = 1.58;
        assertEquals("Thừa cân", a.BMI(n, c));
    }
    @Test
    public void tes2t() {
        n = 65.0;
        c = 1.67;
        assertEquals("Thừa cân", a.BMI(n, c));
    }
    @Test
    public void test3() {
        n = 40.0;
        c = 1.55;
        assertEquals("Thiếu cân", a.BMI(n, c));
    }
    @Test
    public void test4() {
        n = 60.00;
        c = 1.58;
        assertEquals("Thừa cân", a.BMI(n, c));
    }
    @Test
    public void test5() {
        n = 120.0;
        c = 1.7;
        assertEquals("Béo phì", a.BMI(n, c));
    }
}