/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.String;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Dell
 */
public class Lab10 {

    /**
     */
    public static String readContentFromFile(String path){
        String a = "";
        File f = new File(path);
        try {
            String line = null;
            BufferedReader bf = new BufferedReader(new FileReader(f));
            if ((line = bf.readLine()) != null) a = line;
            while((line = bf.readLine()) != null){
                a += "\n" + line;
                
            }
            bf.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Not found");
        } catch (IOException ex) {
            System.out.println("ERROR!");
        }
        return a;
    }

    public static List<String> getAllFunctions(String path) throws IOException {
        
        String a = null;
        List<String> ls = new ArrayList<>();
        File f = new File(path);
        try {
            String line = null;
            BufferedReader bf = new BufferedReader(new FileReader(f));
            while ((line = bf.readLine()) != null){
                a = line;
                if(line.contains("static") && line.contains("{")){
                    Queue<String> Q = new LinkedList();
                    Q.add("{");
                    while( Q!= null){
                        line = bf.readLine();
                        if(line.contains("{")) Q.add("{");
                        if(line.contains("}")) Q.poll();
                        a+= "\n" + line;
                    }
                }
            }
            ls.add(a);
        } 
        catch (FileNotFoundException ex) {
            System.out.println("File not found!");;
        } 
        catch (IOException ex){
            System.out.println("Fail!");
        }
        return ls;
    }
    
    public static String findFunctionByName(String name) throws IOException{
        List<String> a = getAllFunctions("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Lab09\\src\\lab09\\ThucHanh09.java");// TODO code application logic here
        int k = 0;
        boolean t = true;
        for(int i = 0; i < a.size(); i++){
            t = true;    
            String[] words1 = a.get(i).split(" ");
            String[] words2 = name.split(",");            
            for(int j = 0; j < words1.length; j++){
                int n = 0;
                if(j % 2 == 0){
                    if(!words1[j].equals(words2[n])) {
                        t = false;
                        break;
                    }
                    n++;
                }
                
            }
            if(t == true) break;
                k = i;
        }
        if(t == true) return a.get(k);
        else return "Not found";
    }
    
    public static void main(String[] args) throws IOException {
        List<String> a = getAllFunctions("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Lab09\\src\\lab09\\ThucHanh09.java");// TODO code application logic here
        System.out.println(a.get(0));
        //System.out.println(a.get(1));
        //System.out.println(a.get(2));
        //System.out.println(a.get(3));
        System.out.println(findFunctionByName("writeContentFromFile(String, String)"));
    }
    
}
