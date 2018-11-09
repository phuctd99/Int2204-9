package IO_Lab09;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Utils {

    public static String readContentFromFile(String path) {
        String contentToRead = null;
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                contentToRead = line.toString();
            }
            br.close();
            return contentToRead;
        }catch(Exception e){
            return "ERROR";
        }

    }

    public static void writeContentToFile(String path) {
        String contentToWrite = "You should learn from your competitor, but never copy. Copy and you die.";
        try {
            PrintWriter file = new PrintWriter(path);
            PrintWriter writer = new PrintWriter(file, false);
            writer.write(contentToWrite);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void appendContentToFile(String path) {
        String contentToAppend = "_______* Jack_ Ma *_______";

        try {
            Files.write(Paths.get(path), contentToAppend.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) {

        File rootFolder = new File(folderPath);
        File[] listFile = rootFolder.listFiles(); // list of sub folder and file in root
        File result = null;
        for (File element : listFile) {
            if (element.isFile()) { // check if it is not folder
                if (element.getName().equals(fileName)) {
                    result = element;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Read Content From File");
        System.out.println(readContentFromFile("C:\\Code\\Lab09.txt"));

        System.out.println("Write Content To File");
        writeContentToFile("C:\\Code\\Lab09.txt");
        System.out.println(readContentFromFile("C:\\Code\\Lab09.txt"));

        System.out.println("Aapend Content To File");
        appendContentToFile("C:\\Code\\Lab09.txt");
        System.out.println(readContentFromFile("C:\\Code\\Lab09.txt"));

        System.out.println("Find File By Name");
        System.out.println(findFileByName("C:\\Code", "Lab09.txt"));
    }

}
