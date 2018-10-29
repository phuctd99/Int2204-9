package Cau2;

import java.io.*;

public class fileNotFound {
    public static void exception() throws FileNotFoundException {
        BufferedReader br = new BufferedReader( new FileReader( new File("oop.txt")));
    }

    public static void main(String[] args) {
        try {
            exception();
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: FileNotFoundException");
        }
    }
}
