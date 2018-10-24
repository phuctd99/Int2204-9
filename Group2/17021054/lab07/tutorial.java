package diagram;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author admin
 */
public class tutorial extends JPanel implements ActionListener{
    Timer t = new Timer(5, this);
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g.setColor(Color.RED);     
        g.drawRect(10, 10, 60, 40);
        g.fillRect(200,150,20,10);
        g.setColor(Color.BLUE);
        g.fillOval(100, 100, 100, 100);
        g.drawLine(10, 10, 50, 50);
        g.drawLine(50, 50, 50, 10);
    }
    public static void main(String[] args){
        tutorial t = new tutorial();
        JFrame jf = new JFrame();
        jf.setTitle("tutorial");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
