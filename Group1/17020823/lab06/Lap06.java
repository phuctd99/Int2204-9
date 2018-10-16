/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap06;
import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Hoang Vu Huong
 */
public class Lap06 extends Canvas{

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {  
        g.drawString("Hello",40,40);  
        setBackground(Color.WHITE);  
        //g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(50,50,50, 50);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
        
    }  
    public static void main(String[] args) {
        // TODO code application logic here
       JFrame j = new JFrame();
       Lap06 g = new Lap06();
       j.setSize(400,400);
       j.add(g);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       j.setVisible(true);
    }
    
}
