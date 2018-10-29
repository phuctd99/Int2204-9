package lab08bt2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Lab08BT2 {
    public static int nullPointer(String s)throws NullPointerException { 
        // Loi tham chieu doi tuong den null
        return s.length();
    } 
    public static int arrayIndex(int[] a, int n) throws ArrayIndexOutOfBoundsException {
        // Loi truy cap vuot ngoai mang
        return a[n];
    }
    public static int invide(int a, int b) throws ArithmeticException {
        // Loi lien quan den toan hoc
        return a / b;
    }
    public static int ClassCast(Object s) throws ClassCastException {
        // Loi ep kieu du lieu
        return (int) s;
    }
    public static void fileNotFound(String s) throws FileNotFoundException {
        BufferedReader g;
        g = new BufferedReader(new FileReader(s));
    }
    public static void IO() throws IOException {
        BufferedReader g;
        FileReader f = new FileReader("text.txt");
        g = new BufferedReader(f);
        System.out.println(g.readLine());
    }
    public static void main(String[] args) {
        String s1 = null;
        try {
            System.out.println(nullPointer(s1));
        } catch (NullPointerException e) {
            System.out.println("Lỗi NullPointerException");
        }
        int[] a = {1, 2, 3, 4, 5};
        try {
            System.out.println(arrayIndex(a,5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi ArrayIndexOfBoundException");
        }
        try {
            System.out.println(invide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Lỗi ArithmeticException");
        }
        Object s2 = "3";
        try {
            System.out.println(ClassCast(s2));
        } catch (ClassCastException e) {
            System.out.println("Loi ClassCastException");
        }
        String linkfile = "Documents\\file.txt";
        try {
            fileNotFound(linkfile);
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi FileNotFoundException");
        }
        try {
            IO();
        } catch (IOException e) {
           System.out.println("Lỗi IOException");
        }
    }
    
    
}
