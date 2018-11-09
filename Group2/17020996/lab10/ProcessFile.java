import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProcessFile {
    public List<String> getAllFunctions(File path) throws IOException {
        List<String> result = new ArrayList<>();
        String temporary = new String();
        String resultElement = "";
        int bracket = 0;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        while ((temporary = bfr.readLine()) != null){
           if (resultElement.equals("")){
                if (temporary.contains("/")) temporary = temporary.substring(0,temporary.indexOf('/'));
                if (temporary.contains("static")){
                    resultElement+=temporary + '\n';
                    for(int i=0; i<temporary.length(); i++){
                        if (temporary.charAt(i) == '{') bracket++;
                         else if (temporary.charAt(i) == '}') bracket--;
                    }
                }
           }else{
               for(int i=0; i<temporary.length(); i++){
                   if (temporary.charAt(i) == '{') bracket++;
                   else if (temporary.charAt(i) == '}') bracket--;
               }
               if (bracket == 0){
                   resultElement+=temporary + '\n';
                   result.add(resultElement);
                   resultElement = "";
               }else{
                   resultElement+=temporary + '\n';
               }
           }
        }
        return result;
    }

    public String findFunctionByName(String name){
        List<String> fn;
        try {
            fn = getAllFunctions(new File("src/Utils.java"));
            for (String str : fn){
                String s = str.substring(0,str.indexOf('\n'));
                int x = s.indexOf('(');
                int y = s.indexOf(')');
                int a = 0;
                for(int i = x; i >= 0; i--){
                    if (s.charAt(i) == ' '){
                        a = i;
                        break;
                    }
                }
                s = s.substring(a+1,y+1);
                x = s.indexOf('(');
                y = s.indexOf(')');
                boolean delete = false;
                for(int i = x+1; i < y; i++){
                    if (s.charAt(i) == ' '){
                        if (s.charAt(i-1) == ',') delete = false;
                            else delete = true;
                    }else if (s.charAt(i) == ','){
                        delete = false;
                    }
                    if (delete){
                        s = s.substring(0,i) + s.substring(i+1,y+1);
                        i--;
                        y--;
                    }
                }
                if (s.equals(name)) return str;
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public int[] bubbleSort(int[] arr){
        int n = arr.length;
        int temporary;
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                if (arr[j] < arr[j-1]){
                    temporary = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temporary;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ProcessFile pf = new ProcessFile();
        /*File f = new File("src/Utils.java");
        try {
            List<String> fn = pf.getAllFunctions(f);
            for (String s : fn){
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }*/

        /*System.out.println(pf.findFunctionByName("findFileByName(String, String)"));*/
        
        /*int[] a = new int[10];
        Random rd = new Random();
        for(int i=0; i<10; i++){
            a[i] = rd.nextInt()%100;
        }
        for(int i=0; i<10; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        a = pf.bubbleSort(a);
        for(int i=0; i<10; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();*/
    }
}
