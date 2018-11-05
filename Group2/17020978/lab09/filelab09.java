package lab09;



import java.io.*;

public class filelab09 {

    public static String readContentFromFile(String path)
    {
        FileReader fr = null;
        BufferedReader br = null;
        StringBuilder string = new StringBuilder();
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String s;
            while((s = br.readLine()) != null)
            {
                string.append(s).append("\n");
            }

        }catch (IOException e)
        {
            System.out.println("Khong Doc Duoc FILE");
        }
        return string.toString();
    }
    public static void writeContentToFile(String path)
    {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);

            bw.write("Nguyen Huu Minh Quang");
        }catch (IOException e)
        {
            System.out.println("Khong Viet Duoc FILE");
        }
        finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }

    }
    public static void writeContentToFile1(String path)
    {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(path,true);
            bw = new BufferedWriter(fw);

            bw.write("\n Nguyen Huu Minh Quang"); //+ System.getProperty("line.separator"));
            bw.close();
        }catch (IOException e)
        {
            System.out.println("Khong Viet Duoc FILE");
        }
    }

    public static File findFileByName(String folderPath, String fileName)
    {
        File file = new File(folderPath);
        File[] list = file.listFiles();
        for(File dir : list)
        {
            String s = dir.getAbsolutePath();
           if(s.equals(folderPath+"\\"+  fileName))
           {
               return dir;
           }
        }
        return null;
    }
    public static void main(String[] args)
    {
        String path = "C:\\Users\\Admin\\Desktop\\quang.txt";
        //System.out.println(readContentFromFile(path));
       // writeContentToFile(path);
        //writeContentToFile1(path);
       System.out.println( findFileByName("E:\\English","1.txt"));
    }
}
