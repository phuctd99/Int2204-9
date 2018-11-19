import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Week10
{
    public static final String path = "Utils.java";

    String insertFromFile (File file) throws FileNotFoundException
    {
        String s = "";
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
        {
            s += sc.nextLine();
            s += "\n";
        }
        sc.close();
        return s;
    }

    void bubleSort (int []a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException
    {
        String regex1 = "(?=\\/\\*)([\\S\\s]*?)(?<=\\*\\/)";
        String regex2 = "(\\\\\\\\.*)";
        String regexString = "(?<=\\\")(.*?)(?=\\\")";

        Week10 week10 = new Week10();
        File file = new File(path);
        String s = week10.insertFromFile(file);

        s = s.replaceAll(regex1, "");
        s = s.replaceAll(regex2, "");
        s = s.replaceAll(regexString, "");
        s = s.replaceAll("\n", " ");
        String temp = "";
        int scope = 0;

        for (int i = s.indexOf('{') + 1; i < s.length(); i++)
        {
            if (s.charAt(i) == '{')
            {

                scope++;
                continue;
            }
            else
            if (s.charAt(i) == '}')
            {
                scope--;
                if (scope == 0)
                {
                    temp += "\n";
                }
                continue;
            }

            if (scope == 0)
            {
                temp += s.charAt(i);
                if (s.charAt(i) == ';')
                {
                    temp += "\n";
                }
            }
        }

        String[] in = temp.split("\n");
        System.out.println(temp);
    }
}
