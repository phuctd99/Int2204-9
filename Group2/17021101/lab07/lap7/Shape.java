/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

/**
 *
 * @author User
 */
public class Shape {
    private int[] X,Y;
    private int x,y;
    private String name = "null",coler = "null";
    private boolean paint;

    public void setColer(String coler) {
        this.coler = coler;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaint(boolean paint) {
        this.paint = paint;
    }

    public void setx(int x) {
        this.x = x;
    }

    public void setX(int[] X) {
        this.X = X;
    }

    public void sety(int y) {
        this.y = y;
    }

    public void setY(int[] Y) {
        this.Y = Y;
    }

    public String getColer() {
        return coler;
    }

    public String getName() {
        return name;
    }

    public int[] getX() {
        return X;
    }

    public int[] getY() {
        return Y;
    }
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
}
