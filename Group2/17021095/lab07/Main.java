/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btt6;


import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class Main {
    
    public static void main (String args[]){
           
        JFrame f = new JFrame(" Vẽ hình ");     
        JPanel p = new Diagram();
        f.add(p);
        f.setSize(1000,1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    }
    
}
