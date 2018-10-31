package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOException {
    public void IOException(String name){
        try {
            FileReader fw = new FileReader(name);
            fw.close();
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
