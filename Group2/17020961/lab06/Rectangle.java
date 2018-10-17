/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author CCNE
 */
public class Rectangle extends Shape {
    private ToaDo tren;
    private ToaDo duoi;

    public Rectangle() {}

    public Rectangle(ToaDo tren, ToaDo duoi) {
        super();
        this.tren = tren;
        this.duoi = duoi;
    }

    public Rectangle(String color, boolean filled, ToaDo tren, ToaDo duoi) {
        super(color, filled);
        this.tren = tren;
        this.duoi = duoi;
    }

    public ToaDo getTren() {
        return tren;
    }

    public void setTren(ToaDo tren) {
        this.tren = tren;
    }

    public ToaDo getDuoi() {
        return duoi;
    }

    public void setDuoi(ToaDo duoi) {
        this.duoi = duoi;
    }

    public int getArea() {
        return (duoi.getX() - tren.getX()) * (duoi.getY() - tren.getY());
    }

    public int getPerimeter() {
        return (duoi.getX() - tren.getX()) + (duoi.getY() - tren.getY()) * 2;
    }
    public void move(int x, int y) {
        tren.setX(tren.getX() + x);
        tren.setY(tren.getY() + y);
        duoi.setX(duoi.getX() + x);
        duoi.setY(duoi.getY() + y);
    }
    public String toString(){
		return "color "+this.getColor()+"\nfilled "+this.isFilled()
				+"\nArena "+this.getArea()+"\nPerimeter "+this.getPerimeter();
	}
    
}
