
package lap09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Pc
 */
public class Lap09 {

    public static String readContentFromFile(String path) throws FileNotFoundException {
        
        String s = null;
        try {      
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            StringBuilder sb = new StringBuilder();
            
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            s = sb.toString();
         
            br.close();
        } catch (Exception e) {

            System.out.println("ERROR!");
        }
      return s;
        
    }
     
    public static void  writeContentToFile(String path) throws NullPointerException{
        BufferedWriter bw = null;
        FileWriter fw = null;
         Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        try{
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            
            bw.write(content);
        }catch(IOException e){
            
            e.printStackTrace();
            
        } finally{
            try{
                if (bw != null)
                 bw.close();
                if (fw != null)
                fw.close();
                
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        }
      
    }
    
    public static void addWritetofie(String path)  {
        BufferedWriter bw = null;
        FileWriter fw = null;
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        try{
            fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            bw.write(content);
            
           
        } catch( IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if (bw != null)
                 bw.close();
                if (fw != null)
                fw.close();
                
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    public static void findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.getName().endsWith(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    findFileByName(f.getAbsolutePath(), fileName);
                }
            }
        } else {
            System.out.println("folderPath không tồn tại");
        }
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String path = "F:\\file.txt";
        
//        writeContentToFile(path);
//       addWritetofie(path);
        findFileByName("F:\\", "file.txt");
//        System.out.println(readContentFromFile(path));
        
    }
    
}
