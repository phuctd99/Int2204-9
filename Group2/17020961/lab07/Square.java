/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.awt.Point;
    public class Square extends Rectangle {
    public Square() {}

    public Square(Point tren, Point duoi) {
        super(tren, duoi);
    }
    public Square(String color, boolean filled, Point tren, Point duoi) {
        super(color, filled, tren, duoi);
    }
    public String toString(){
            return super.toString();
	}
    public void setRect(java.awt.Rectangle rect) {
		rect.setBounds(rect.x, rect.y , rect.width, rect.width);
		super.setRect(rect);
	}
}
