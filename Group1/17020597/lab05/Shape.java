/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 * có 3 quan hệ kế thừa : Circle kế thừa shape, rectangle kế thừa shape, square kế thừa rectangle;
 * circle có quan hệ HAS-A rectagle vì nó không có chung thuộc tính với rectangle
 * trong java không hỗ trợ đa kế thừa
 * @author Admin
 */
public class Shape {
    private String color = "red";
    private boolean filled = true;
    public void setColor(String color) {this.color = color; }
    public String getColor() {return this.color; }
    public void setFilled(boolean filled) {this.filled = filled; }
    public boolean isFilled() {return this.filled; }
    
    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    @Override
    public String toString(){
        return this.color + "\n" + this.filled;
    }
    public static void main(String[] args) {
        Shape shape = new Shape("pink", true);
        System.out.println(shape.toString());
        System.out.println(shape.getColor());
    }
}
