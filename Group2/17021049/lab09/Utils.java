import java.io.*;
import java.util.*;

public class Utils {

private static Scanner sc = new Scanner(System.in);

    public static String readContentFromFile(String path) {
        String line = "";
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner sc = new Scanner(bufferedReader);
            while (sc.hasNextLine()) {
                line += sc.nextLine();
                line += "\n";
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return line;

    }

    public static void writeContentToFile(String path) {

        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(sc.nextLine());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeAddContentToFile(String path) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(sc.nextLine());
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName){
        File dir = new File(folderPath);
        File[] children = dir.listFiles();
        for (File file : children) {
            if (file.getName().equals(fileName)) return file;
        }

        return null;

    }

    public static void main(String[] args) {
           System.out.print("Nhap du lieu : ");
           writeContentToFile("Footballer.txt");
           System.out.println(readContentFromFile("Footballer.txt"));

           System.out.print("Nhap du lieu : ");
           writeAddContentToFile("addFootballer.txt");
           System.out.println(readContentFromFile("addFootballer.txt"));

           System.out.println(findFileByName("C:\\Users\\Thuan\\Documents\\Namefolder", "Name.txt"));
    }


}
