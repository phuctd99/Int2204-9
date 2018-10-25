package test05;

public class Shape{
    protected String color;
    protected Boolean filled;

    public Shape(){ //kb không khởi tạo
        this.color = "red";
        this.filled = true;
    }

    public Shape(String a, boolean b){ //kb tương tự
        this.color = a;
        this.filled = b;
    }

    public String getColor(String red) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled(boolean filled) {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
