package lab04;

import org.junit.*;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class lab04Test {

    @Test
    public void max(){
            int a = 3;
            int b = 6;
            int result = 6;
            int maxresult = lab04.max(a, b);
            assertEquals(maxresult, result);
            }


    @Test
    public void min() {
        int arr[] = {1, -3, 5, 8};
        int result = -3;
        int minresult = lab04.min(arr);
        assertEquals(result, minresult);
    }

    @Test
    public void IBM() {
        double a = 1.60;
        double b = 48.64;
        String result = "Bình thường";
        String ibmresult = lab04.IBM(a, b);
        assertEquals(result, ibmresult);
    }
}