
package tuan_8b;

/**
 *
 * @author Pc
 */
import java.io.*;
public class testIOE {
    public static void main(String[] args) throws IOException{
        try{
            
        byte bWrite [] = {11,21,3,40,5};
         OutputStream os = new FileOutputStream("test.txt");
         for(int x = 0; x < bWrite.length ; x++) {
            os.write( bWrite[x] );  
         }
         os.close();
     
         InputStream is = new FileInputStream("testtt.txt");
         int size = is.available();

         for(int i = 0; i < size; i++) {
            System.out.print(is.read() + "  ");
         }
         is.close();
        } catch(Exception e){
            System.out.println("loi ");
        }
    }
}
