/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw;

import Shapes.Circle;
import Shapes.Point2D;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Vu Huong
 */
public class DrawCircle extends Draws{
    public Circle ci = new Circle();
    public Component comp ;
    public void setComp(int x, int y, int radius) {
        ci.setRadius(radius);
        ci.setPointcenter(new Point2D(x,y));
        comp = new Component() {
            @Override
            public void paint(Graphics g){
                g.setColor(ci.getColor());
                g.fillOval(0, 0, radius, radius);
            }
        
        };
        comp.setLocation((ci.getPointcenter().getX()-radius), (ci.getPointcenter().getY()-radius));
        comp.setSize(2 * radius, 2*radius);
    }
    @Override
    public void add(){
    int x, y, radius;
    try {
        String _x = JOptionPane.showInputDialog("Toạ độ X là");
        if(_x== null || _x.equals("")){
            comp = null;
            return;
        }
        else{
            x = Integer.parseInt(_x);
        }
        String _y = JOptionPane.showInputDialog("Toạ độ Y là");
        if(_y== null || _y.equals("")){
            comp = null;
            return;
        }
        else{
            y = Integer.parseInt(_y);
        }
        String _r = JOptionPane.showInputDialog("Bán kính là");
        if(_r== null || _r.equals("")){
            comp = null;
            return;
        }
        else{
            radius = Integer.parseInt(_r);
        }
        ci.setColor(Color.BLUE);
        ci.setFilled(true);
        setComp(x,y,radius);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hãy nhập số nguyên");
        comp = null;
    }
}
    @Override
    public void move(){
    int dx, dy;
    try {
        String _x = JOptionPane.showInputDialog("Toạ độ X mới");
        if(_x== null || _x.equals("")){
            return;
        }
        else{
            dx = Integer.parseInt(_x);
        }
        String _y = JOptionPane.showInputDialog("Toạ độ Y mới");
        if(_y== null || _y.equals("")){
            return;
        }
        else{
            dy = Integer.parseInt(_y);
        }
        setComp(dx, dy, ci.getRadius());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Nhập số nguyên");
    }
}
}
