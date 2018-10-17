/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Draw extends JFrame {

    public Draw() {
        setTitle("Show Shapes");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g2d.setPaint(new Color(255, 51, 51));
        g2d.fillOval(50, 50, 100, 100);
        
        
    }

}
