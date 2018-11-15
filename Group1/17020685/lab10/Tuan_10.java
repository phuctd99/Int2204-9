/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_10;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static tuan_10.Utils.readContentFromFile;

/**
 *
 * @author HP
 */
public class Tuan_10 {

    /**
     * @param args the command line arguments
     */
    public static Hashtable<String, String> ht = new Hashtable<>();
    
    public static void getAllFunction(File path) throws IOException {
        String str = readContentFromFile(path.getPath()).trim();
        int size = str.length();
        String pattern = "(.*)static(.*)\\{";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while (m.find()) {

            // lấy ra vị trí tên hàm trong file
            int a = str.indexOf(m.group(0).substring(0, m.group(0).trim().length() - 1));
            int b = a;

            // đếm số ngoặc đóng mở nếu bằng thì lấy đc toàn bộ nội dung của hàm ( bao gồm tên hàm)
            int start = 0, end = 0;
            while (a++ < size) {
                if (str.charAt(a) == '{') {
                    start++;
                } else if (str.charAt(a) == '}') {
                    end++;
                }
                if (start == end && start != 0) {
                    break;
                }
            }
            ///ht.put(name_Function ?, str.substring(b, a + 1));
            
            // thực hiện lấy ra tên hàm theo format đề bài
            int c = m.group(0).indexOf("(");
            int d = m.group(0).indexOf(")");
            String name_Function = "";
            for (int i = c; i > 0; i--) {
                if (m.group(0).charAt(i) == ' ') {
                    name_Function = m.group(0).substring(i + 1, c);
                    break;
                }
            }
            String[] membersVariable = m.group(0).substring(c, d).split(", ");
            for (int i = 0; i < membersVariable.length; i++) {
                name_Function += membersVariable[i].split(" ")[0];
                if (i + 1 < membersVariable.length) {
                    name_Function += ",";
                }
            }
            name_Function += ")";

            // thêm tên và nội dung vào bảng tra
            ht.put(name_Function, str.substring(b, a + 1));
        }
    }
    
    public static List<String> getAllFunctions() {
        ArrayList<String> arr = new ArrayList<>();
        try {
            Class c = Utils.class;
            Method[] m = c.getDeclaredMethods();

            for (Method m1 : m) {
                arr.add(m1.toString());
            }
        } catch (SecurityException e) {
            System.err.println(e);
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i).substring(arr.get(i).indexOf("Utils") + 6, arr.get(i).indexOf(")") + 1));
            arr.set(i, arr.get(i).replaceAll("java.lang.", ""));
        }
        return arr;
    }

    public String findFunctionByName(String name) {
        return "\n" + name + ": \n" + ht.get(name);

    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        getAllFunctions().forEach(System.out::println);

        getAllFunction(new File("src\\Tuan_10\\Utils.java"));

        ht.entrySet().forEach((entry) -> {
            System.out.println("\n" + entry.getKey() + ": \n" + entry.getValue());
        });

        System.out.println(new Tuan_10().findFunctionByName("writeContentToFile2()"));

    }      
    
}
