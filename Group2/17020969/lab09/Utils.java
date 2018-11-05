import java.io.*;
import java.util.*;
public class Utils {
    static Scanner sc = new Scanner(System.in);
    public static String readContentFromFile(String path){
        BufferedReader in = null;
        String s = "";
        // mở tệp để đọc
        try{
            in = new BufferedReader(new FileReader(new File(path)));
            String line;
            //readLine() dùng để đọc từng dòng một tập tin và trả lại nội dung.
            while((line = in.readLine()) != null){
                s = s + line + "\n";
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return s;
    }
    public static void writeContentToFile(String path) throws IOException{
        /* new FileWriter(file): nếu tệp đã tồn tại, thì toàn bộ nội dung của tệp sẽ bị xóa 
           và nội dung mới sẽ được ghi trên tệp đó */
        BufferedWriter files = null;
        FileWriter f = null; 
        try{
            String content = "hello, my name is ...";
            File file = new File(path);
            if(file.exists()){
                // thêm nội dung vào tệp
                f = new FileWriter(file);
                files = new BufferedWriter(f);
                files.write(content);
            }
            
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally{
            try{
                if(files != null){
                    files.close();
                }
                if(f != null){
                    f.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public static void writeContentToFile2(String path) throws IOException{
        // new FileWriter(file, true) : Giữ nội dung đang tồn tại và thêm nội dung mới vào cuối file
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            File file = new File(path);
            if(file.exists()){
                fw = new FileWriter(path, true);
                bw = new BufferedWriter(fw);
                String content = "\nI am studying UET.";
                // thêm nội dung vào tệp
                bw.write(content);
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally{
            try{
                if(bw != null){
                    bw.close();
                }
                if(fw != null){
                    fw.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        File[] findFiles = file.listFiles();
        for(int i = 0; i < findFiles.length; i++){
            if(fileName.equals(findFiles[i].getName())){
                return findFiles[i];
            }
        }
        return null;
    }
    public static void main(String[] args) throws IOException{
        String path = "E:/hi.txt";
        writeContentToFile(path);
        writeContentToFile2(path);
        System.out.println(readContentFromFile(path));
        
        String folderPath = "E:/file09";
        String fileName = "1.txt";
        System.out.println(findFileByName(folderPath, fileName));
    }
}
