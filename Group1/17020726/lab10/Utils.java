import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils
{
    static File file;
    static String s;
    public static String readContentFromFile(String path)
    {

        {
            sc = new Scanner(file, "utf8");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        s = "";
        while (sc.hasNextLine())
        {
            s += sc.nextLine();
        }
        return s;
    }

    public static void realyWrite(String path, boolean bool) throws IOException
    {
        s = "";
        file = new File(path);
        FileWriter fileWriter = new FileWriter(file,bool);
        fileWriter.write(s);
        fileWriter.close();
    }

    public static File findFileByName(String folderPath, String fileName)
    {
        File dir = new File(folderPath);
        File[] fileArr = file.listFiles();
        for (File search : fileArr)
        {
            if (search.getName() == fileName)
                return search;
        }
        return null;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
    }
}
