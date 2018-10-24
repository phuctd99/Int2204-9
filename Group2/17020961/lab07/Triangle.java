/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;
public class Triangle extends Shape implements Paint_App.Class2D{
    private Polygon Triangle;
    private Color lineColor = null;
    private Color color = null;
    public Triangle() {}
   @Override
	public void makeObject(Point startDrag, Point endDrag){
		setLineColor(Draw.selectColor);
		int midx;
		int midy;
		if (startDrag.x > endDrag.x){
			midx = endDrag.x +(Math.abs(startDrag.x - endDrag.x));
			midy = endDrag.y;
		}
		else{
			midx = endDrag.x - (Math.abs(startDrag.x - endDrag.x));
			midy = endDrag.y;
		}
		int[] xs = {startDrag.x, endDrag.x, midx};
		int[] ys = { startDrag.y, endDrag.y, midy};
		Polygon pol = new Polygon(xs, ys, xs.length);
		this.setTriangle(pol);
	}
	@Override
	public void draw(GraphicAdapter g) {
		if(getColor() == null){
    		g.getGraphicAdapter().setColor(getLineColor());
    		g.getGraphicAdapter().drawPolygon(getTriangle());
    	}
		else{
			g.getGraphicAdapter().setColor(getColor());
			g.getGraphicAdapter().fillPolygon(getTriangle());
		}
	}
	@Override
    public void fill(Color c){
		this.setColor(c);
	}
	
	@Override
	public boolean contains(Point p) {
		return getTriangle().contains(p);
	}

	@Override
	public void move(Point startDrag, Point endDrag) {
		int[] xs = {0, 0, 0};
		int[] ys = {0, 0, 0};
		for(int k = 0; k < 3; k++ ){
			xs[k] = this.getTriangle().xpoints[k] + endDrag.x - startDrag.x;
			ys[k] = this.getTriangle().ypoints[k] + endDrag.y - startDrag.y;
		}
		this.setTriangle(new Polygon(xs,ys,3));
	}
        public Polygon getTriangle() {
		return Triangle;
	}
	public void setTriangle(Polygon triangle) {
		Triangle = triangle;
	}
	public Color getLineColor() {
		return lineColor;
	}
	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
