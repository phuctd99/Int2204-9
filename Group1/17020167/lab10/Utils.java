/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Utils {

    public static String readContentFromFile(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(path));
        String content = "";
        while (sc.hasNextLine()) {
            content += sc.nextLine();
        }
        return content;
    }

    public static void writeContentToFile(String path) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        FileOutputStream fos = new FileOutputStream(path, false);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        osw.write("đây là file được ghi");
        osw.write("\r\n");
        osw.flush();
        fos.flush();
    }

    public static void writeContentToExistFile(String path) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        FileOutputStream fos = new FileOutputStream(path, true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        osw.write("ghi tiếp file có sẵn");
        osw.write("\r\n");
        osw.flush();
        fos.flush();
    }

    public static File findFileByName(String folderPath, String fileName) {
        try{
        File folder = new File(folderPath);
        File res = null;
        File [] child = folder.listFiles();
        
        for(File file: child){
            if(file.getName().equals(fileName)) {
                res = file;
                break;
            }
        }
        if(res!=null){
            return res;
        }
            System.out.println("file không tồn tại trong thư mục");
            return res;
        }catch(Exception e){
            System.out.println("Thư mục không tòn tại");
            return null;
        }
    }
    
//    public static void abc () { }
/*    public static void abc () 
    { System.out.println();
    */

        public 
        static
        void main(String[] args) {
        try {
            System.out.println(readContentFromFile("readfile.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            writeContentToFile("writefile.txt");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            writeContentToExistFile("writefile.txt");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(findFileByName("D:\\Code\\Java\\lab09", "writefile.txt"));

    }

}
