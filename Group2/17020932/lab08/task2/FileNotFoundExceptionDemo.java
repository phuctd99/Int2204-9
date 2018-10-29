package task2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo {
   public void fileReader(String path) throws FileNotFoundException {
       FileReader r = new FileReader(path);
   }

    public static void main(String[] args) {
        FileNotFoundExceptionDemo tmp = new FileNotFoundExceptionDemo();
        try{
            tmp.fileReader("abc");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
