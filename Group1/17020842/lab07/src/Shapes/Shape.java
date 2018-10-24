/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author CACLV
 */
abstract public class Shape extends JComponent {

    protected Color color;
    public boolean filled;

    // kiểm tra hai hình có trùng nhau không
    abstract public boolean isSame(Shape shape);

    /**
     *
     * @param g
     */
    // hàm vẽ hình trên jpanel
    abstract public void draw(Graphics g);

    //abstract public void move(int x, int y, int dx, int dy);

    // hàm kiểm tra xem tọa độ (x, y) có nằm trong phạm vi của hình không
    abstract public boolean contain(int x, int y);

    public boolean getFilled() {
        return filled;
    }

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
