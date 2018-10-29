package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {
    public void readFile(String fileName) throws IOException {
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(fileName));
        String str;
        while ((str = bufferedReader.readLine())!= null) {
            System.out.println(str);
        }
        bufferedReader.close();
    }

    public static void main(String[] args) {
        IOExceptionDemo tmp = new IOExceptionDemo();
        try {
            tmp.readFile("mnkj");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
