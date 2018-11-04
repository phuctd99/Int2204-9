import java.io.*;
import java.util.Scanner;

public class Utils{

    public static String readContentFromFile(String path) throws IOException {
        String result ="";
        String temporary;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        while ((temporary = bfr.readLine()) != null){
            result += temporary + '\n';
        }
        bfr.close();
        return result;
    }

    public static void writeContentToFile(String path, boolean append) throws IOException{
        Scanner scr = new Scanner(System.in);
        String content;
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, append), "UTF-8"));
        //tab để kết thúc
        while ((content = scr.nextLine()).charAt(0) != '\t')
        bfw.write(content + '\n');
        bfw.close();
    }

    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        File[] listFile = file.listFiles();
        for (File f : listFile){
            if (f.toString().equals(folderPath+'\\'+fileName)){
                return f;
            }
        }
        return null;
    }
}
