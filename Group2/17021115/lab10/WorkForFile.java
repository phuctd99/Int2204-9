/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10;

import static java.awt.PageAttributes.MediaType.C;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CCNE
 */
public class WorkForFile {

    public static List<String> getAllFunctions(File path) {
        List<String> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();

            while (line != null) {
                String s = "";
                if (line.contains("static") && !line.contains("//")
                        && !line.contains("/*")) {
                    s += line;
                    list.add(s.substring(0, s.length() - 1));
                }

                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    static String findFunctionByName(String name, List<String> list) {
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            if (name.contains(list.get(i))) {
                String[] arr = list.get(i).split(" ");
                for (int j = 1; j < arr.length; j += 2) {
                    s = s + arr[j] + ",";
                }
                s = s.substring(0, s.length() - 1);
                s += ")";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\CCNE\\Documents\\NetBeansProjects\\Week10\\src\\Week10\\Ultis.java");
        List<String> list = new ArrayList<>();
        list = getAllFunctions(file);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
