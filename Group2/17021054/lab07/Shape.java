package diagram;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Shape {
    protected int x;
    protected int y;
    protected Color color;
    protected String name;
    private int[] X,Y;

  
    
    Scanner scan = new Scanner(System.in);
    
    protected Shape(int _x, int _y, String name, Color color){
        x=_x;
        y=_y;
        this.name = name;
        this.color = color;
    }
   
    public void setx(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }

    public void setX(int[] X) {
        this.X = X;
    }

    public void setY(int[] Y) {
        this.Y = Y;
    }

    public int[] getX() {
        return X;
    }

    public int[] getY() {
        return Y;
    }
    
      public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    

}
