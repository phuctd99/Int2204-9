package DrawGraphics;

import java.awt.*;

public class Shape extends Layer {
    protected Color color;
    protected boolean filled;
    protected String name;

    public Shape(){
    }

    public Shape(Color color, boolean filled, String name) {
        this.color = color;
        this.filled = filled;
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
