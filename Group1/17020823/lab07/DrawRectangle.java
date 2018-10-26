/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw;

import Shapes.Point2D;
import Shapes.Rectangle;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Vu Huong
 */
public class DrawRectangle extends Draws{
    public Rectangle rec = new Rectangle();
    public Component comp ;
    public void setComp(int x, int y, int w, int h){
        rec.setWidth(w);
        rec.setHeigth(h);
        rec.setPointcenter(new Point2D(x,y));
        comp = new Component() {
            @Override
            public void paint(Graphics g){
                g.setColor(rec.getColor());
                g.fillRect(0, 0, w, h);
            }
            
};
        comp.setLocation(rec.getPointcenter().getX(), rec.getPointcenter().getY());
        comp.setSize(w, h);
    }
    @Override
    public void add(){
        int w, h,x,y;
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
        String _w = JOptionPane.showInputDialog("Chiều dài là");
        if(_w== null || _w.equals("")){
            comp = null;
            return;
        }
        else{
            w = Integer.parseInt(_w);
        }
        String _h = JOptionPane.showInputDialog("Chiều rộng là");
        if(_h== null || _h.equals("")){
            comp = null;
            return;
        }
        else{
            h = Integer.parseInt(_h);
        }
        rec.setColor(Color.yellow);
        rec.setFilled(true);
        setComp(x, y, w, h);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nhập không đúng");
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
        setComp(dx, dy, rec.getWidth(),rec.getHeigth());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Nhập số nguyên");
    
    }
    }
}
