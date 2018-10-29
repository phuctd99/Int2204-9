package cau2;
import java.io.*;
import java.util.Scanner;
public class IOExceptions {
    public void Read(String filename){
        BufferedReader file = null;
        try {
            // mở tệp để đọc
            file = new BufferedReader(new FileReader(new File(filename)));
            // đọc tất cả nội dung của file
            String inputLine;
            while((inputLine = file.readLine()) != null)
                System.out.println(inputLine);
        }
        catch(IOException ex) {
            System.err.println(ex);
            //ex.printStackTrace();
        }
    }
     public static void main(String[] args) throws IOException{ 
        IOExceptions so = new IOExceptions();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten file: ");
        String filename = sc.next();
        so.Read(filename);
    }
}