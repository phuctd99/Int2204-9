/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopw10;

/**
 *
 * @author nguyenhuy
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

import java.util.List;

public class Bai1 {

    private static File test = new File("C:\\Users\\nguyenhuy\\Documents\\NetBeansProjects\\OOPW9\\src\\oopw9\\Utils.java ");

    public List<String> getAllFunctions(File path) {
        List<String> list = new ArrayList<String>();
        try {
            FileReader file = new FileReader(path);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String fullLine = sc.nextLine().trim();
                if (fullLine.startsWith("public static")) {
                    list.add(fullLine);
                }
            }
            sc.close();
        } catch (Exception e) {
        }
        return list;
    }

    public static void in(List<String> l) {
        if (!l.isEmpty()) {
            System.out.println(l.get(1));
            int i = 0;
            for (String s : l) {

                System.out.println(s);
            }
        } else {
            System.out.println("Không tìm thấy phương thức phù hợp");
        }

    }

    public String findFunctionByName(String name) {
        List<String> list = new ArrayList<>();
        String s = "";
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int n = name.indexOf(",");
        String st = name.substring(0, n);
        int i = 0;
        int j = 0;
        try {
            FileReader file = new FileReader(test);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String fullLine = sc.nextLine();
                if (fullLine.contains("/*") && j == 0) {
                    j++;
                }
                if (fullLine.contains("*/") && j > 0) {
                    fullLine = fullLine.substring(fullLine.indexOf("*/")+ 2);
                    j--;
                }
                if (fullLine.contains("//") && j == 0) {
                    fullLine = fullLine.substring(0, fullLine.indexOf("//"));
                }
                if (fullLine.contains(st) && j == 0) {
                    i++;
                }
                if (i > 0) {
                    s = s + fullLine + "\n";
                    if (fullLine.contains("{")) {
                        count1++;
                    } else if (fullLine.contains("}")) {
                        count2++;
                    }
                    if (count1 == count2 && count1 != 0) {
                        list.add(s);
                        i = 0;
                    }

                }

            }

            sc.close();
        } catch (Exception e) {
        }
        return s;
    }

    public static void main(String[] args) {
        Bai1 so = new Bai1();
        in(so.getAllFunctions(test));
        System.out.println(so.findFunctionByName("public static File findFileByName(String, String)"));

    }
}
