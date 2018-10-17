package lab6;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }




}
