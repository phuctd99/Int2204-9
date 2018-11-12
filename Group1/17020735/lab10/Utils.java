
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {

    public static String path = "C:\\Users\\Admin\\Documents\\NetBeansProjects\\Lab09\\src\\Utils.java";

    public static String readContentFromFile(String path) {
        String result = "";
        try {
            File inFile = new File(path);
            FileReader fileReader = new FileReader(inFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                result = result.concat(line + "\r\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeContentToFile(String path) {
        Scanner sc = new Scanner(System.in);
        String content = readContentFromFile(path);
        String str = sc.nextLine();
        content = content.concat(str);
        try {
            File outFile = new File(path);
            FileWriter fileWriter = new FileWriter(outFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File result = null;
        File file = new File(folderPath);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.getName().equals(fileName)) {
                result = file1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(readContentFromFile(path));

    }

}
