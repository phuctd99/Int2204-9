
package tuan_8b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class test5 {
    public static void main(String [] args) throws FileNotFoundException  {
        try{
            Scanner inFile = new Scanner(new FileInputStream("F:\\hih.txt"),"UTF-8");
        } catch(Exception e) {
            System.out.println("File not found");
        }
    }
}
