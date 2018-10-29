package cau2;
import java.io.BufferedReader;
import java.io.*;
public class FileNotFoundExceptions {
    private static final String filename = "E:/helllo.txt";
    public void Read()throws FileNotFoundException, IOException{
        BufferedReader file = null;
        try {
            // mở tệp để đọc
            file = new BufferedReader(new FileReader(new File(filename)));
            // đọc tất cả nội dung của file
            String inputLine;
            while((inputLine = file.readLine()) != null)
                System.out.println(inputLine);
        }
        catch(FileNotFoundException ex) {
            System.err.println("Lỗi file!");
            //ex.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileNotFoundExceptions si = new FileNotFoundExceptions();
        si.Read();
    }
}
/*
    Một tập tin với tên đường dẫn cụ thể nào không tồn tại
*/