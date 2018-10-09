/*
 *  Có 3 quan hệ kế thừa:
 *  + Circle kế thừa Shape
 *  + Rectangle kế thừa Shape
 *  + Square kế thừa Rectangle
 *  Circle không kế thừa Rectangle vì trong Rectangle không có các thuộc tính mà Circle cần tới
 */

public class Shape {

    private String color = "red";

    private boolean filled = true;

    public Shape(){
        color = "";
        filled = true;
    }

    public Shape(String color, boolean filled){
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

    public String toString(){
        return this.getColor() + "\n" + this.isFilled();
    }

    public static void main(String[] args) {
        Shape h1 = new Shape("red", true);
        System.out.println(h1.toString());
    }
}
