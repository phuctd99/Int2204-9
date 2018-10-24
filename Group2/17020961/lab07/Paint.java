/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;
import java.awt.Point;
public interface Paint {
	public void draw(GraphicAdapter g); //Chuc nang chinh: Draw - ve doi tuong
	public boolean contains(Point p);	//Kiem tra diem co thuoc doi tuong
	public void move(Point startDrag, Point endDrag);	//Ham di chuyen doi tuon
	public void makeObject(Point startDrag, Point endDrag);	//Tao doi tuong
}