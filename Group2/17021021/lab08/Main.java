import java.io.*;

public class Main {

    public void nullPointer(int n) throws NullPointerException {
        if (n <= 0) {
            Main _main = null;
            _main.nullPointer(0);
        }
        System.out.println("NullPointer");
    }

    public void arrayIndexOfBound(int n) throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[10];
        arr[n] = 0;
        System.out.println("ArrayIndexOfBound");
    }

    public void arithmetic(int n) throws ArithmeticException {
        n = 100 / n;
        System.out.println("Arithmetic");
    }

    public void classCast(int n) throws ClassCastException {
        Object temp = "123";
        if (n == 0) {
            n = (int) temp;
        }
        System.out.println("ClassCast");
    }

    public void IO(String string) throws IOException {
        new FileReader(string);
        System.out.println("IO");
    }

    public void fileNotFound(String path) throws FileNotFoundException {
        FileReader in = new FileReader(path);
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.nullPointer(0);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            main.arrayIndexOfBound(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            main.arithmetic(0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            main.classCast(0);
        } catch (ClassCastException e) {
            System.out.println(e);
        }

        try {
            main.IO("1");
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            main.fileNotFound("abc");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
