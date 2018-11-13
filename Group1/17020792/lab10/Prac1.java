/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Prac1 {

    public static String readFile(String path) throws IOException {

        String code = "";
        try {
            String temp;
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((temp = br.readLine()) != null) {
                // Loại các comment "//"
                if (temp.trim().startsWith("//")) {
                } else if (temp.contains("//")) {
                    code = code + temp.substring(0, temp.indexOf("//")) + "\n";
                } else {
                    code = code + temp + "\n";
                }
            }

           
            int x = code.indexOf("/*");
            while (x != -1) {
                int y = code.indexOf("*/");
                String r;
                if (y == -1) {
                    y = code.length();
                    r = code.substring(x, y);
                    code = code.replace(r, " ");
                } else {
                    r = code.substring(x, y + 2);
                    code = code.replace(r, " ");
                }

                x = code.indexOf("/*");
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        } catch (IOException ex) {
            System.out.println("Fail Read File");
        }

        return code;

    }

    public static String subFunction(String str, int first) {
        int last = first;
        int cntOpen = 0;
        int cntClose = 0;
        int j = first;
        while (j < str.length()) {
            if (str.charAt(j) == '{') {
                cntOpen++;
            }
            if (str.charAt(j) == '}') {
                cntClose++;
            }
            if (cntClose != 0 && cntOpen != 0 && cntClose == cntOpen) {
                last = j;
                break;
            }
            j++;

        }
        return str.substring(first, last + 1);
    }
    public static void exportFuncToFile(String s, String path) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file, true);
        PrintWriter out = new PrintWriter(writer);
        try {
            out.print(s);
            out.close();
        } catch (Exception e) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static void main(String[] args) throws IOException {


    }
}
