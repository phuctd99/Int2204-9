import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class lab09 {

    public  String readContentFromFile(String path){
        FileInputStream file = null;
        String result = "";
        try {
            file = new FileInputStream(path);
                int s = file.read();
                while (s != -1){
                    result +=(char) s;
                    s = file.read();
                }
            } catch (Exception e) {
                System.out.print("lỗi đọc file");
            }
        return result;
    }
    public void writeContentToFile(String path) {

        try {
            FileOutputStream fileOP = new FileOutputStream(path);
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập dữ liệu mới: ");
            String s = sc.next();
            //sc.nextLine();
            fileOP.write(s.getBytes());
        } catch (Exception e) {
            System.out.print("Lỗi ghi file");
        }
    }
    public void writeConntinue(String path) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập dữ liệu ghi thêm: ");
            String data = sc.nextLine();

            File file = new File(path);


            if (!file.exists()) {
                file.createNewFile();
            }

            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);

        } catch (Exception e) {
            System.out.print("Lỗi ghi file");
        }
    }

    public File findFileByName(String folderPath, String fileName){

        File file = new File(folderPath);
        String[] findfile = file.list();
        if (findfile != null) {
            for (int i = 0; i < findfile.length; i++) {
                if(findfile[i].equals(fileName)){

                    file = new File(folderPath + fileName);
                }
            }
        }
        return file;
    }

    public static void main(String[] args)  {
        lab09 lab9 = new lab09();
        System.out.println(lab9.readContentFromFile("test.txt"));
        //lab9.writeContentToFile("test.txt");
        lab9.writeConntinue("test.txt");
        System.out.println(lab9.readContentFromFile("test.txt"));
        //File file = lab9.findFileByName("D:\\", "test.txt");
       // System.out.println(lab9.readContentFromFile("test.txt"));
    }
}



