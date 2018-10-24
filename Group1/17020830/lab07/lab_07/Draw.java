/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;


import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class Draw extends JFrame{
    Shape cr1 = new Circle(50);
    public void chuyendoi(){
        
    }
    
    public Draw(){
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public void paint(Graphics cr){
        super.paint(cr);
     
    
    }
    
    public static void main(String[] args) {
        new Draw();
    }



    
}
