/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;
public class Hexagon extends Shape implements Paint_App.Class2D{
    private int[] xPoints;
    private int[] yPoints;
    private Polygon Hexagon;
    private Color lineColor = null;
    private Color color = null;

    public void setxPoints(int[] xPoints) {
        this.xPoints = xPoints;
    }

    public void setyPoints(int[] yPoints) {
        this.yPoints = yPoints;
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    @Override
    public void fill(Color color) {
       this.setColor(color);
    }

    @Override
    public void draw(GraphicAdapter g) {
        if(getColor() == null){
    		g.getGraphicAdapter().setColor(getLineColor());
    		g.getGraphicAdapter().drawPolygon(getHexagon());
    	}
		else{
			g.getGraphicAdapter().setColor(getColor());
			g.getGraphicAdapter().fillPolygon(getHexagon());
		}
    }

    @Override
    public boolean contains(Point p) {
        return getHexagon().contains(p);
    }

    @Override
    public void move(Point startDrag, Point endDrag) {
        int[] xs = {0, 0, 0, 0, 0, 0};
		int[] ys = {0, 0, 0, 0, 0, 0};
		for(int k = 0; k < 6; k++ ){
			xs[k] = this.getHexagon().xpoints[k] + endDrag.x - startDrag.x;
			ys[k] = this.getHexagon().ypoints[k] + endDrag.y - startDrag.y;
		}
		this.setHexagon(new Polygon(xs,ys,6));
    }

    @Override
    public void makeObject(Point startDrag, Point endDrag) {
        setLineColor(Draw.selectColor);
//        int midx;
//        int midy;
//        int right1x;
//        int right1y;
//        int left1x;
//        int left1y;
//        int right2x;
//        int right2y;
//        int mid1x;
//        int mid1y;
//	if (startDrag.x > endDrag.x && startDrag.y > endDrag.y){
//           
//            left1x = endDrag.x;
//            left1y = endDrag.y + 2*(Math.abs(startDrag.y-endDrag.y));
//            right1x = startDrag.x + Math.abs(startDrag.x - endDrag.x);
//            right1y = left1y;
//            right2y = endDrag.y;
//            right2x = right1x;
//            mid1x = startDrag.x;
//            mid1y = endDrag.y - Math.abs(startDrag.y-endDrag.y);
//            midx = startDrag.x;
//            midy = left1y + Math.abs(startDrag.y-endDrag.y);
//            int[] xs = {endDrag.x,mid1x,right2x,right1x,midx,left1x};
//            int[] ys = {endDrag.y,mid1y,right2y,right1y,midy,left1y};
//            Polygon pol = new Polygon(xs, ys, xs.length);
//            this.setHexagon(pol);
//	}
    int[] xs = {100,150,200,200,150,100};
    int[] ys = {250,300,250,150,100,150};
        Polygon pol = new Polygon(xs, ys, xs.length);
        this.setHexagon(pol);
    }
     public Polygon getHexagon() {
		return Hexagon;
	}
	public void setHexagon(Polygon hexagon) {
		Hexagon = hexagon;
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
