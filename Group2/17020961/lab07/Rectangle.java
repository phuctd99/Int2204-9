/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Color;
import java.awt.Point;


public class Rectangle extends Shape implements Paint_App.Class2D{
    private Point duoi;
    private Point tren;
    private java.awt.Rectangle rect;
    private Color lineColor;
    private Color color = null;
    public Rectangle() {}

    public Rectangle(Point duoi, Point tren) {
        super();
        this.duoi = duoi;
        this.tren = tren;
    }

    public Rectangle(String color, boolean filled, Point duoi, Point tren) {
        super(color, filled);
        this.duoi = duoi;
        this.tren = tren;
    }

    public Point getTren() {
        return tren;
    }

    public void setTren(Point tren) {
        this.tren = tren;
    }

    public Point getDuoi() {
        return duoi;
    }

    public void setDuoi(Point duoi) {
        this.duoi = duoi;
    }

    public int getArea() {
        return (tren.x - duoi.x) * (tren.y - duoi.y);
    }

    public int getPerimeter() {
        return (tren.x - duoi.x) + (tren.y - duoi.y) * 2;
    }
    public String toString(){
		return "color "+this.getColor()+"\nfilled "+this.isFilled()
				+"\nArena "+this.getArea()+"\nPerimeter "+this.getPerimeter();
	}
    public void makeObject(Point startDrag, Point endDrag) {
		setLineColor(Draw.selectColor);
		java.awt.Rectangle r = new java.awt.Rectangle(Math.min(startDrag.x, endDrag.x), Math.min(startDrag.y, endDrag.y), Math.abs(startDrag.x - endDrag.x), Math.abs(startDrag.y - endDrag.y));	
		this.setRect(r);
	}
    public java.awt.Rectangle getRect() {
		return rect;
	}
	public void setRect(java.awt.Rectangle rect) {
		this.rect = rect;
	}
	public Color getLineColor() {
		return lineColor;
	}
	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}
	public void setColor(Color color) {
		this.color = color;
	}
        public Color getColor() {
		return color;
	}

    @Override
	public void draw(GraphicAdapter g) {
    	if(getColor() == null){
    		g.getGraphicAdapter().setColor(this.getLineColor());
    		g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
    	}
    	else{
    		g.getGraphicAdapter().setColor(this.getColor());
        	g.getGraphicAdapter().fillRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
        	g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
    	}
    }
    @Override
    public void fill(Color c){
		this.setColor(c);
	}
    @Override
    public boolean contains(Point p) {
    	return this.getRect().contains(p);
    }
    @Override
    public void move(Point startDrag, Point endDrag){
    	java.awt.Rectangle r = new java.awt.Rectangle(this.getRect().x + (endDrag.x - startDrag.x),this.getRect().y + (endDrag.y - startDrag.y), this.getRect().width, this.getRect().height);
    	this.setRect(r);
    }
}
