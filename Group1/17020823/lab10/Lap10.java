/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jcp.xml.dsig.internal.dom.Utils;

/**
 *
 * @author Hoang Vu Huong
 */
public class Lap10 {

    /**
     * @param args the command line arguments
     */
    public static Hashtable<String, String> hash = new Hashtable<>();
     public static String readContentFromFile(String path) throws IOException {
        int a ;
        try (FileReader fileReader = new FileReader(path);
                BufferedReader b = new BufferedReader(fileReader)) {
            while((a= b.read()) != -1){
            System.out.print((char)a);
            }
        } catch(FileNotFoundException e){
            System.err.println("Khong tim thay file");
        }
        
        return "";
    }
    public static void getAllFunctions(File path) throws IOException {
        String str = readContentFromFile((path.getPath()).trim());
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

            
            hash.put(name_Function, str.substring(b, a + 1));
        }
    }

    public static List<String> getAllFunctions_Name() throws IOException {

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

    public String findFunctionByName(String name) throws IOException {
        return "\n" + name + ": \n" + hash.get(name);
    }

    public static void main(String[] args) throws IOException {

        getAllFunctions_Name().forEach(System.out::println);

        getAllFunctions(new File("src\\Lap10\\Lap10.java"));

        hash.entrySet().forEach((entry) -> {
            System.out.println("\n" + entry.getKey() + ": \n" + entry.getValue());
        });

        System.out.println(new Lap10().findFunctionByName("writeContentToFile2()"));

    }

}
