/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Admin
 */
public class IOexp {
    private final String str = "back_tract.txt";
    public static void method(String str) throws IOException {
        BufferedReader br = null;
        try {
            FileInputStream fileInPutStream = new FileInputStream(str);
            Reader reader = new java.io.InputStreamReader(fileInPutStream, "UTF-8");
            br = new BufferedReader(reader);
            String ex;
            while ((ex = br.readLine()) != null) {
                System.out.println(ex);
            }
            br.close();
        }
        catch (FileNotFoundException | UnsupportedEncodingException ex) {
            System.out.println("Không tìm thấy file");
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }
    public static void main(String[] args) throws IOException {
        String str = "back_tract.txt";
        method(str);
    }
}
