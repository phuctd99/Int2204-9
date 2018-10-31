import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOException {
    public void writeFile() throws java.io.IOException {
        FileReader fw = new FileReader("data.txt");
        fw.close();
    }

    public static void main(String args[]) {
        try {
            IOException se5 = new IOException();
            se5.writeFile();
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
