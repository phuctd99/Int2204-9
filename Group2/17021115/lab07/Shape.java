	package Week7;

import java.awt.Graphics;

public abstract class Shape {
    protected String color = "Blue";
    protected boolean filled;

    public Shape () {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}