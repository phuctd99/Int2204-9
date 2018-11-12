
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class cau1 {
    public static List<String> getAllFunctions(File path) throws FileNotFoundException, IOException{
        String result = "";
        String trunggian ="";
        int count = 0;
        List<String> list = new ArrayList<>();
        FileInputStream file = new FileInputStream(path);
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        while((trunggian = br.readLine()) != null){
            if(result ==""){
                if(trunggian.contains("/")){
                    trunggian = trunggian.substring(0, trunggian.indexOf("/"));
                
            }

                if(trunggian.contains("static")){
                    result +=trunggian + '\n';
                    for(int i =0; i < trunggian.length(); i++){
                        if(trunggian.charAt(i) == '{'){
                            count++;
                        } else if(trunggian.charAt(i) =='}'){
                            count--;
                        }
                        
                    }
                }
            } else{
                for(int i =0; i < trunggian.length(); i++){
                        if(trunggian.charAt(i) == '{'){
                            count++;
                        } else if(trunggian.charAt(i) =='}'){
                            count--;
                        }
                
                }
                if(count ==0){
                    result += trunggian +'\n';
                    list.add(result);
                    result ="";
                } else {
                    result += trunggian+'\n';
                }
                    
        }
        }
          return list;
        }
    
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        File name = new File("src/cau2.java");
        list = getAllFunctions(name);
        for(int i =0; i< list.size() ; i++){
            System.out.println(list.get(i));
        }
        
    }
}


