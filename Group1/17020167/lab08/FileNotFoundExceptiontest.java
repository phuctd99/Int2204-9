/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class FileNotFoundExceptiontest {

    public void testMethod1() throws IOException {
		File file = new File("test1.txt");
		try{
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		}catch (FileNotFoundException e){			
			System.out.println("FileNotFoundException");
		}
    }
    public static void main(String[] args) throws IOException {
        FileNotFoundExceptiontest newt = new FileNotFoundExceptiontest();
        newt.testMethod1();
    }
    
}
