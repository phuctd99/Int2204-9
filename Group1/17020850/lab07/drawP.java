
package lab06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;


public class drawP extends JFrame implements MouseListener,MouseMotionListener{
    int x1 = 100,y1 = 100;
    int x2 = 200,y2 = 200;
    int x3 = 100,y3 = 300;
    public drawP()
    {
        
       setVisible(true);
        setSize(600, 800);
        setTitle("Hình chữ nhât");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void paint(Graphics p)
    {
        super.paint(p);
        
        p.setColor(Color.green);
        p.fillRect(x1, y1, 100, 100);
        p.setColor(Color.pink);
        p.fillOval(x2, y2, 200, 200);
        p.setColor(Color.red);
        
        
        
    }
    public static void main(String[] args) {
        new drawP();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        

}

    @Override
    public void mousePressed(MouseEvent e) {
           x2 = e.getX();
        y2 = e.getY();
        repaint();
}

  
    @Override
    public void mouseDragged(MouseEvent e) {
         x1 = e.getX();
        y1 = e.getY();
        repaint();
        
        
   }

    @Override
    public void mouseMoved(MouseEvent e) {
    
    }
}
