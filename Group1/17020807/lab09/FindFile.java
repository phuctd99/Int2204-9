/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Dell
 */
public class FindFile {
    public static File findFileByName(String path, String name){
        File file = new File("");
        file = new File(path + "\\" + name);
        return file;
    }
}
