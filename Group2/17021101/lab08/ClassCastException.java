package com.company;

import java.util.ArrayList;
import java.util.Queue;

public class ClassCastException extends Throwable {
    public void ClassCastException(){
        ArrayList<Integer> a = new ArrayList<>();
        try {
            Queue<Integer> b = (Queue)a;
        } catch (java.lang.ClassCastException e) {
            System.out.println(e);
            System.out.println("Lỗi ép kiểu!!!");
        }
    }
}
