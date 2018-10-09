package bai2;

public class Shape {
    public String color;
    public boolean filled;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }

    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape {" + "color = " + color  + ",filled = " + filled +"}";
    }
}
