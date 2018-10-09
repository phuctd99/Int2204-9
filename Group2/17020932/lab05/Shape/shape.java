package Shape;

public class shape {
    protected String color;
    protected boolean filled;

    public shape() {
        color = "red";
        filled = true;
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        String s = color + ", " + Boolean.toString(filled) ;
        return s;
    }

}
