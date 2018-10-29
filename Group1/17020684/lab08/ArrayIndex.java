
package tuan_8b;

/**
 *
 * @author Pc
 */
import java.util.ArrayList;
public class ArrayIndex {
     public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    { 
        try{
        ArrayList<String> list = new ArrayList<>(); 
        list.add("My"); 
        list.add("Name"); 
        System.out.println(list.get(2)); 
        } catch(Exception e) {
            System.out.println("loi tran mang");
        }
    } 
}
