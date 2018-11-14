
package lab10bt1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Lab10BT1 {

    public static List<String> getAllFunctions(File path) throws IOException {
        List<String> result = new ArrayList<>();
        String tmp = "";
        String Value = "";
        int count = 0;
        FileInputStream file = new FileInputStream(path);
        InputStreamReader input = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(input);
        while ((tmp = br.readLine()) != null){
           if (Value.equals("")){
                if (tmp.contains("/")) tmp = tmp.substring(0,tmp.indexOf('/'));
                if (tmp.contains("static")){
                    Value += tmp + '\n';
                    for(int i=0; i< tmp.length(); i++){
                        if (tmp.charAt(i) == '{') count++;
                         else if (tmp.charAt(i) == '}') count--;
                    }
                }
           }else{
               for(int i = 0; i< tmp.length(); i++){
                   if (tmp.charAt(i) == '{') count++;
                   else if (tmp.charAt(i) == '}') count--;
               }
               if (count == 0){
                   Value += tmp + '\n';
                   result.add(Value);
                   Value = "";
               }else{
                   Value += tmp + '\n';
               }
           }
        }
        return result;
    }
    public static String findFunctionByName(String name){
        List<String> st;
        try {
            st = getAllFunctions(new File("src\\Utils.java"));
            for (String str : st){
                String s = str.substring(0,str.indexOf('\n'));
                int m = s.indexOf('(');
                int n = s.indexOf(')');
                int k = 0;
                for(int i = m; i >= 0; i--){
                    if (s.charAt(i) == ' '){
                        k = i;
                        break;
                    }
                }
                s = s.substring(k+1, n+1);
                m = s.indexOf('(');
                n = s.indexOf(')');
                boolean delete = false;
                for(int i = m+1; i < n; i++){
                    if (s.charAt(i) == ' '){
                        if (s.charAt(i-1) == ',') delete = false;
                            else delete = true;
                    }else if (s.charAt(i) == ','){
                        delete = false;
                    }
                    if (delete){
                        s = s.substring(0, i) + s.substring(i+1, n+1);
                        i--;
                        n--;
                    }
                }
                if (s.equals(name)) return str;
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        File file = new File("src\\Utils.java");
        List <String> st = getAllFunctions(file);
        for (String s : st) {
            System.out.println(s);
        }
        String s = findFunctionByName("findFileByName(String, String)");
        System.out.println(s);
    }
    
}
