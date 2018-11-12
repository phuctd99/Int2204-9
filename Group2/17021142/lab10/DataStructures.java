import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DataStructures {

    static String findFunctionByName(String name) throws IOException {
        String path = "C:\\Users\\zeroa\\IdeaProjects\\oop_tuan9_IO\\src\\Utils.java";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String result = "";
        String line = "";
        boolean tmp = false;

        while( (line = bufferedReader.readLine()) != null) {
            if (line.contains(name)) {
                tmp = true;
                result = name + " ( ";
                String[] list = line.split(" ");
                for(int i=0; i<list.length; i++){
                    if( list[i].equals( "(")){
                        i++;
                        while( !list[i].equals(")")){
                            if( list[i].equals("String") || list[i].equals(",")){
                                result += list[i] + " ";
                            }
                            i++;
                        }
                        result += " )";
                    }
                }

            }
        }
        bufferedReader.close();
        fileReader.close();
        if( tmp) {
            return result;
        }
        else{
            return " k tim thay ham";
        }
    }

    static List<String> getAllFunctions(String path) throws IOException {
        List<String> result = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String st = "";
        String line = "";
        Stack<String> stack = new Stack();
        boolean tmp = false;

        while( (line = bufferedReader.readLine()) != null){
            if( line.contains("static")){
                tmp = true;
                st += line + "\n";
                stack.push("{");
                line = bufferedReader.readLine();
            }

            if( tmp) {
                String[] list = line.split(" ");
                for (int i = 0; i < list.length; i++) {
                        st += list[i] + " ";
                        if (list[i].equals("}")) {
                            stack.pop();
                        }
                        if (list[i].equals("{")) {
                            stack.push("{");
                        }
                        if (stack.isEmpty()) {
                            tmp = false;
                            result.add(st);
                            st = "";
                        }

                }
            }
            st += "\n";
        }

        bufferedReader.close();
        fileReader.close();
        return result;
    }

    public static void main(String[] args) throws IOException {
        List<String> result = getAllFunctions("C:\\Users\\zeroa\\IdeaProjects\\oop_tuan9_IO\\src\\Utils.java");
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
//        System.out.println(findFunctionByName("readContentFromFile"));
//        System.out.println(findFunctionByName("findX"));

    }
}
