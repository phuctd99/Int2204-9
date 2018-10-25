package test05;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class main {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.setAx(0);
        r.setBx(3);
        r.setCx(3);
        r.setAy(0);
        r.setBy(0);
        r.setCy(4);
        r.setColor("red");
        r.setFilled(true);
        r.setLength();
        r.setWidth();
        r.cvdt(r);
        Draw d = new Draw();
        JFrame j = new JFrame();
        j.add(d);
        j.setSize(1000, 1000);

        //System.out.println(r.toString());
        Graphics g;
        d.drawRec(r, g);
    }
}
