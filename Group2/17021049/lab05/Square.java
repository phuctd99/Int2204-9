package bai2;

import java.util.Scanner;

public class Square extends Rectangle {
    //Ham khoi tao lop Square

    public Square() {
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public void setSide(double side){
        super.length = side;
        super.width = side;
    }

    public double getSide(){
        return super.length;
    }

    public void setWidth(double side) {
        super.width = side;
    }

    public void setLength(double side) {
        super.length = side;
    }

    public String toString(){
        return super.toString();
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        System.out.println("In Dien tich : " + sq.getArea());
        System.out.println("In Chu vi : " + sq.getPerimeter());
        System.out.println("In ghi de : " + sq.toString());
    }


}
