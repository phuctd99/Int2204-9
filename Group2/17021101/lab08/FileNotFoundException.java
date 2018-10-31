package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotFoundException {
    public void FileNotFoundException(String name) throws java.io.FileNotFoundException {
            try {
                FileReader fw = new FileReader(name);
                fw.close();
            } catch (IOException e) {
                System.out.println("Lỗi file!!!");
            }
    }
}
