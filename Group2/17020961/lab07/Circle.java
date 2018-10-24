/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
/**
 *
 * @author CCNE
 */
public class Circle extends Shape implements Paint_App.Class2D{
    private Point tam;
    private int radius;
    private final double PI = 3.14;
    private Ellipse2D elip2d;
    private Color linecolor = null;
    private Color color = null;
    public  Circle() {}

    public Circle(Point center, int radius) {
        super();
        this.tam = center;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, Point tam, int radius) {
        super(color, filled);
        this.tam = tam;
        this.radius = radius;
    }

    public Point getCenter() {
        return tam;
    }

    public void setCenter(Point tam) {
        this.tam= tam;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }
    public void move(int x, int y) {
        tam.x = (this.tam.x + x);
        tam.y = (this.tam.y + y);
    }
    @Override
	public void makeObject(Point startDrag, Point endDrag) {
		setLineColor(Draw.selectColor);
		Ellipse2D r = new Ellipse2D.Float(Math.min(startDrag.x, endDrag.x), Math.min(startDrag.y, endDrag.y), Math.abs(startDrag.x - endDrag.x), Math.abs(startDrag.y - endDrag.y));
	    this.setElip2d(r);
	}
        public void draw(GraphicAdapter g) {
		if(getColor() == null){
    		g.getGraphicAdapter().setColor(getLineColor());
    		g.getGraphicAdapter().drawOval((int)getElip2d().getX(),(int)getElip2d().getY(), (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
    	}
    	else{
    		g.getGraphicAdapter().setColor(getColor());
    		g.getGraphicAdapter().fillOval((int)getElip2d().getX(),(int)getElip2d().getY(), (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
    	}
    }
	@Override
	public void fill(Color c){
		this.setColor(c);
	}
    @Override
    public boolean contains(Point p) {
    	return this.getElip2d().contains(p);
    }
    @Override
    public void move(Point startDrag, Point endDrag){
    	this.getElip2d().setFrame(getElip2d().getX() + endDrag.x - startDrag.x,this.getElip2d().getY() + endDrag.y - startDrag.y,this.getElip2d().getWidth(), this.getElip2d().getHeight());
    }
    public Ellipse2D getElip2d() {
		return elip2d;
	}
	public Color getLineColor() {
		return linecolor;
	}
	public void setLineColor(Color linecolor) {
		this.linecolor = linecolor;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
        public void setElip2d(Ellipse2D elip2d) {
		elip2d.setFrame(elip2d.getX(), elip2d.getY(), elip2d.getWidth(), elip2d.getWidth());
		//super.setElip2d(elip2d);
                this.elip2d = elip2d;
	}
}
