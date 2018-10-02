package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    Main test = new Main();

    @Test
    public void max() {
        Assert.assertEquals( 17, test.Max(17,13));
    }
    @Test
    public void max1() {
        Assert.assertEquals(26,test.Max(15,26));
    }
    @Test
    public void max2() {
        Assert.assertEquals(25,test.Max(25,12));
    }
    @Test
    public void max3() {
        Assert.assertEquals(30,test.Max(30,12));
    }
    @Test
    public void max4() {
        Assert.assertEquals(32,test.Max(32,12));
    }
    @Test
    public void minArray() {
        int [] a = {100 ,105, 102, 100,200};
        Assert.assertEquals(100, test.minArray(a));
    }
    @Test
    public void minArray1() {
        int [] b = { 0, 1, 2 ,3};
        Assert.assertEquals( 0, test.minArray(b));
    }
    @Test
    public void minArray2() {
        int [] c = { 10, 11 , 120};
        Assert.assertEquals(10, test.minArray(c));
    }
    @Test
    public void minArray3() {
        int [] d = {0, 0, 0, 0};
        Assert.assertEquals( 0, test.minArray(d));

    }
    @Test
    public void minArray4() {
        int [] e = { 15, 10};
        Assert.assertEquals( 10, test.minArray(e));
    }
    @Test
    public void BMI() {
        Assert.assertEquals("Thieu can", test.BMI(36,1.5));
    }
    @Test
    public void BMI1() {
        Assert.assertEquals("Binh thuong", test.BMI(58.87,1.6));
    }
    @Test
    public void BMI2() {
        Assert.assertEquals("Thua can", test.BMI(64,1.6));
    }
    @Test
    public void BMI3() {
        Assert.assertEquals("Beo phi", test.BMI(60,1.4));
    }
    @Test
    public void BMI4() {
        Assert.assertEquals("Thua can", test.BMI(61,1.6));
    }
}

