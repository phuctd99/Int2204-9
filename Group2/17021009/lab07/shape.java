package Tuan7;

import java.awt.*;

public abstract class shape {
    private String color ;
    private boolean filled;
    private boolean visible;

    public shape () {}

    public shape(String color, boolean filled, boolean visible) {
        this.color = color;
        this.filled = filled;
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
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

}
