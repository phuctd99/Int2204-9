import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExceptionMain {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner("hello.txt");
            throw new FileNotFoundException();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
