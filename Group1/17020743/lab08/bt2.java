/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author CCNE
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class bt2 {
      public static int NullPointerException(String s)throws NullPointerException { 
        // Loi tham chieu doi tuong den null
        return s.length();
    } 
    public static int ArrayIndexOutOfBoundsException(int[] a, int i) throws ArrayIndexOutOfBoundsException {
        // Loi truy cap vuot ngoai mang
        return a[i];
    }
    public static int ArithmeticException(int x, int y) throws ArithmeticException {
        // Loi lien quan den toan hoc
        return x / y;
    }
    public static int ClassCastException(Object s) throws ClassCastException {
        // Loi ep kieu du lieu
        return (int) s;
    }
    public static void FileNotFoundException(String s) throws FileNotFoundException {
        BufferedReader g;
        g = new BufferedReader(new FileReader(s));
    }
    public static void IOException() throws IOException {
        BufferedReader g;
        FileReader f = new FileReader("text.txt");
        g = new BufferedReader(f);
        System.out.println(g.readLine());
    }
    public static void main(String[] args) {
        String s1 = null;
        try {
            System.out.println(NullPointerException(s1));
        } catch (NullPointerException e) {
            System.out.println("Lỗi Null");
        }
        int[] a = {1, 2, 3, 4, 5};
        try {
            System.out.println(ArrayIndexOutOfBoundsException(a,5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi vượt ngoài chỉ số mảng");
        }
        try {
            System.out.println(ArithmeticException(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Lỗi Toán HỌc");
        }
        String s2 = "10";
        try {
            System.out.println(ClassCastException(s2));
        } catch (ClassCastException e) {
            System.out.println("Loi ép kiểu dữ liệu");
        }
        String file = "C:\\Users\\CCNE\\Downloads\\file.txt";
        try {
            FileNotFoundException(file);
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi FileNotFoundException");
        }
        try {
            IOException();
        } 
        catch (IOException e) {
           System.out.println("Lỗi IOException");
        }
    }
}

