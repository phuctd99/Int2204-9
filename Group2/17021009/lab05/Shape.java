package Cau2;

public class Shape {
    private String color;
    private boolean filled;

    //Phương thức khởi tạo không tham số
    public Shape() {
        color = "red";
        filled = true;
    }

    //Phương thức khởi tạo với 2 tham số color và filled
    public Shape( String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //Các phương thức get/set

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
        return "Hình có màu " + this.color + " filled = " + this.filled;
    }
}
