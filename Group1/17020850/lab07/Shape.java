package lab06;

import java.util.Scanner;


public abstract class Shape {
    Scanner scan = new Scanner(System.in);
    protected int x;
    protected int y;
    protected boolean canMove;
    protected boolean color;

    public void input(){
        System.out.println("Nhap toa do x: ");
        x = scan.nextInt();
        System.out.println("Nhap toa do y: ");
        y = scan.nextInt();
    }

    public void output() {

           System.out.println("Toa do dinh : "+"("+x +"," +y+")");
    }

    public void Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public boolean isColor() {
        return color;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}