/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw;

import Shapes.Point2D;
import Shapes.Square;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Vu Huong
 */
public class DrawSquare extends Draws{
    public Square sq = new Square();
    public Component comp ;
    public void setComp(int x, int y, int side){
       sq.setSide(side);
       sq.setPointcenter(new Point2D(x,y));
       comp = new Component() {
           @Override
           public void paint(Graphics g){
               g.setColor(sq.getColor());
               g.fillRect(0, 0, side, side);
           }
};
        comp.setLocation(x, y);
        comp.setSize(side,side);
    }
    @Override
    public void add(){
    int x,y,side;
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
        String _Side = JOptionPane.showInputDialog("Độ dài 1 cạnh là");
        if(_Side== null || _Side.equals("")){
            comp = null;
            return;
        }else{
            side = Integer.parseInt(_Side);
        }
       sq.setColor(Color.CYAN);
       sq.setFilled(true);
        setComp(x, y, side);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Nhập sai dữ liệu");
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
        setComp(dx, dy, sq.getSide());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Nhập số nguyên");
    
    }
}
}
