import org.junit.Test;

import static org.junit.Assert.*;

public class Lab04Test {

    // Test Ham gia tri lon nhat cua 2 so nguyen
    @Test
    public void maxHaiso() {
        int a = 4;
        int b = 6;
        assertEquals(b,Lab04.maxHaiso(a,b));
    }
    @Test
    public void maxHaiso1() {
        int a = 41;
        int b = 6;
        assertEquals(a,Lab04.maxHaiso(a,b));
    }
    @Test
    public void maxHaiso2() {
        int a = 41;
        int b = 60;
        assertEquals(b,Lab04.maxHaiso(a,b));
    }
    @Test
    public void maxHaiso3() {
        int a = 410;
        int b = 60;
        assertEquals(a,Lab04.maxHaiso(a,b));
    }
    @Test
    public void maxHaiso4() {
        int a = 410;
        int b = 600;
        assertEquals(b,Lab04.maxHaiso(a,b));
    }


    // Test Ham gia tri nho nhat mang

    @Test
    public void minSN() {
        int a[] ={15,65,25,66,669,2316,3566,1,26,3,5,25,64,552};
        assertEquals(1,Lab04.minSN(a));
    }
    @Test
    public void minSN1() {
        int a[] ={15,65,25,66,669,2316,3566,26,3,5,25,64,552};
        assertEquals(3,Lab04.minSN(a));
    }
    @Test
    public void minSN2() {
        int a[] ={15,65,25,66,669,2316,3566,12,26,34,5,25,64,552};
        assertEquals(5,Lab04.minSN(a));
    }
    @Test
    public void minSN3() {
        int a[] ={15,65,25,66,669,2316,3566,12,26,34,52,25,64,552};
        assertEquals(12,Lab04.minSN(a));
    }
    @Test
    public void minSN4() {
        int a[] ={152,65,25,66,669,2316,3566,21,26,34,52,25,64,552};
        assertEquals(21,Lab04.minSN(a));
    }



    // Test ham BMI
    @Test
    public void ktBMI() {
        double weight = 50;
        double height = 1.7;
        assertEquals("Thiếu cân",Lab04.ktBMI(weight,height));
    }
    @Test
    public void ktBMI1() {
        double weight = 60;
        double height = 1.7;
        assertEquals("Bình Thường",Lab04.ktBMI(weight,height));
    }
    @Test
    public void ktBMI2() {
        double weight = 70;
        double height = 1.7;
        assertEquals("Thừa cân",Lab04.ktBMI(weight,height));
    }
    @Test
    public void ktBMI3() {
        double weight = 80;
        double height = 1.7;
        assertEquals("Béo Phì",Lab04.ktBMI(weight,height));
    }
    @Test
    public void ktBMI4() {
        double weight = 66.45555;
        double height = 1.7;
        assertEquals("Bình Thường",Lab04.ktBMI(weight,height));
    }
    @Test
    public void ktBMI5(){
        double weight = 66.47;
        double height = 1.7;
        assertEquals("Thừa cân",Lab04.ktBMI(weight,height));
    }



}
