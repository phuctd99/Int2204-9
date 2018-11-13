/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Week10 {

    /**
     * @param args the command line arguments
     */
    public static List<String> getAllFunctions(File path) throws FileNotFoundException, IOException
    {
        List<String> list=new ArrayList<>();
        List<String> result= new ArrayList<>();
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String s="";
        while((s=br.readLine())!=null)
        {
            s=s.trim();
            list.add(s);
        }
        for(int i=0;i<list.size();i++)
        {
            if((list.get(i).startsWith("public static")==true||list.get(i).startsWith("private static")==true)&&(list.get(i).contains("{")==true))
            {
                String temp="";
                int tmp = 1;
                for(int j=i+1;j<list.size();j++)
                {
                    temp+=list.get(j-1)+"\n";
                    if(list.get(j).contains("{")==true)
                    {
                        tmp++;
                    }
                    if(list.get(j).equals("}")==true)
                    {
                        tmp--;
                    }
                    if(list.get(j).equals("}")==true&&tmp==0)
                    {
                        break;
                    }
                }
                temp=temp+"}";
                result.add(temp);
                temp="";
            }
        }
        br.close();
        return result;
    }
    public static String findFunctionByName(String name,List<String> list) throws FileNotFoundException, IOException
    {
        name=name.substring(0,name.indexOf("("));
        System.out.println(name);
        for(int i=0;i<list.size();i++)
        {
            String temp=list.get(i).substring(0,list.get(i).indexOf("\n"));
            if(temp.contains(name)==true)
            {
                return list.get(i);
            }
        }
        return "Khong tim thay!";
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file = new File("C:/Users/Admin/Desktop/test.txt");
        List<String> test = getAllFunctions(file);
        String s = findFunctionByName("writeContinueFile(String path)", test);
        System.out.println(s);
}
}