/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class IOExceptiontest {

    public void testMethod1() throws IOException {
		File file = new File("test.txt");
		try{
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		}catch (IOException e){			
			System.out.println("IOExceptiontest");
		}
    }
    
    public static void main(String[] args) throws IOException {
        IOExceptiontest newt = new IOExceptiontest();
        newt.testMethod1();
    }
    
}
