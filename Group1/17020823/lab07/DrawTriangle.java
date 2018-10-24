/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw;

import Shapes.Point2D;
import Shapes.Triangle;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Vu Huong
 */
public class DrawTriangle extends Draws{
    public Triangle tri = new Triangle();
    public Component comp ;
    public void setComp(int[] x, int[] y) {
        tri.setPoint1(new Point2D(x[0], y[0]));
        tri.setPoint2(new Point2D(x[1], y[1]));
        tri.setPoint3(new Point2D(x[2], y[2]));
        int[] arrayX = calculatePointDrawX();
        int[] arrayY = calculatePointDrawY();
        comp = new Component() {
            @Override
            public void paint(Graphics g){
                g.setColor(tri.getColor());
                g.fillPolygon(arrayX, arrayY, 3);
            }
};
        
}
    @Override
    public void add(){
        int x0, y0, x1, y1, x2, y2;
        try {
            String _x0 = JOptionPane.showInputDialog("Điểm thứ nhất - X");
            if (_x0 == null) {
                comp = null;
                return;
            } else {
                x0 = Integer.parseInt(_x0);
            }

            String _y0 = JOptionPane.showInputDialog("Điểm thứ nhất - Y");
            if (_y0 == null) {
                comp = null;
                return;
            } else {
                y0 = Integer.parseInt(_y0);
            }

            String _x1 = JOptionPane.showInputDialog("Điểm thứ hai - X");
            if (_x1 == null) {
                comp = null;
                return;
            } else {
                x1 = Integer.parseInt(_x1);
            }

            String _y1 = JOptionPane.showInputDialog("Điểm thứ hai - Y");
            if (_y1 == null) {
                comp = null;
                return;
            } else {
                y1 = Integer.parseInt(_y1);
            }

            String _x2 = JOptionPane.showInputDialog("Điểm thứ ba - X");
            if (_x2 == null) {
                comp = null;
                return;
            } else {
                x2 = Integer.parseInt(_x2);
            }

            String _y2 = JOptionPane.showInputDialog("Điểm thứ ba - Y");
            if (_y2 == null) {
                comp = null;
                return;
            } else {
                y2 = Integer.parseInt(_y2);
            }
            tri.setColor(Color.red);
            tri.setFilled(true);
            setComp(new int[]{x0, x1, x2}, new int[]{y0, y1, y2});

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dữ liệu không đúng");
        }
    }
    @Override
     public void move() {
        int x, y;
        try {
            String xS = JOptionPane.showInputDialog("Nhập tọa độ mới X");
            if (xS == null) {
                return;
            } else {
                x = Integer.parseInt(xS);
            }

            String yS = JOptionPane.showInputDialog("Nhập tọa độ mới Y");
            if (yS == null) {
                return;
            } else {
                y = Integer.parseInt(yS);
            }

            int subX = x - tri.getPoint1().getX();
            int subY = y - tri.getPoint1().getY();

            int x0 = x, y0 = y;
            int x1 = tri.getPoint2().getX() + subX;
            int y1 = tri.getPoint2().getY() + subY;
            int x2 = tri.getPoint3().getX() + subX;
            int y2 = tri.getPoint3().getY() + subY;
            setComp(new int[]{x0, x1, x2}, new int[]{y0, y1, y2});

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dữ liệu không đúng");
        }
    }
    public int calculateLocationX() {
        return Math.min(tri.getPoint1().getX(), Math.min(tri.getPoint2().getX(), tri.getPoint3().getX()));
    }
     public int calculateLocationY() {
        return Math.min(tri.getPoint1().getY(), Math.min(tri.getPoint2().getY(), tri.getPoint3().getY()));
    }
    public int[] calculatePointDrawX() {
        int[] pointX = new int[3];
        pointX[0] = tri.getPoint1().getX() - calculateLocationX();
        pointX[1] = tri.getPoint2().getX() - calculateLocationX();
        pointX[2] = tri.getPoint3().getX() - calculateLocationX();
        return pointX;
    }

    public int[] calculatePointDrawY() {
        int[] pointY = new int[3];
        pointY[0] = tri.getPoint1().getY() - calculateLocationY();
        pointY[1] = tri.getPoint2().getY() - calculateLocationY();
        pointY[2] = tri.getPoint3().getY() - calculateLocationY();
        return pointY;
    }
}
