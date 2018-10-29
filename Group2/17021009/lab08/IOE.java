package Cau2;

import java.io.IOException;

public class IOE {
    public static void ioe() throws IOException {
        Object x = new Integer(9);
        System.out.println( (String)x);
    }

    public static void main(String[] args) {
        try {
            ioe();
        } catch ( Exception e) {
            System.err.println("ERROR ");
        }
    }
}
