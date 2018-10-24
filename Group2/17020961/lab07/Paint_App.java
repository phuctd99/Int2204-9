/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;

public class Paint_App extends JComponent {
	public Point startDrag, endDrag;
	public Paint ptemp;
	public BasicStroke bstroke;
        public Paint_App() {
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
	          startDrag = new Point(e.getX(), e.getY());
	          endDrag = startDrag;
	          if(Draw.selectShap == "move"){
		          for(int i = Draw.paint.size() - 1; i>=0; i=i-1){
		        	  Paint pt = Draw.paint.get(i);
	        		  if(pt.contains(startDrag)){
	        			  ptemp = pt;
	        			  Draw.paint.remove(pt);
	        			  break;
	        		  }
		          }
	          }
                  // xoa cac hinh trung nhau
	          else if(Draw.selectShap == "Delete" ){
                      boolean checkRec = false;
                      boolean checkSqua = false;
                      boolean checkCir = false;
                      boolean checkTri = false;
                      
		          for(int i =  Draw.paint.size() - 1; i>=0; i=i-1){
		        	  Paint pt = Draw.paint.get(i);
		        	    if(pt instanceof Rectangle){
                                        if(checkRec == true){
		        			  ptemp = null;
		        			  Draw.paint.remove(pt);
		        			  //break;
                                        }
                                        checkRec = true;
		        	    }
                                    else if(pt instanceof Square){
                                        if(checkSqua== true){
		        			  ptemp = null;
		        			  Draw.paint.remove(pt);
		        			  //break;
                                        }
                                        checkSqua = true;
		        	    }
                                    else if(pt instanceof Circle){
                                        if(checkCir == true){
		        			  ptemp = null;
		        			  Draw.paint.remove(pt);
		        			  //break;
                                        }
                                        checkCir = true;
		        	    }
                                    else if(pt instanceof Triangle){
                                        if(checkTri == true){
		        			  ptemp = null;
		        			  Draw.paint.remove(pt);
		        			  //break;
                                        }
                                        checkTri = true;
		        	    }
		          }
	          }
			}
	        public void mouseReleased(MouseEvent e) {
	        	Point p = new Point(e.getX(), e.getY());
	        	if(Draw.selectShap == "Rectangle"){
	        		Rectangle obj = new Rectangle();
	        		obj.makeObject(startDrag, p);
	    			Draw.paint.add(obj);
	        	}
	        	else if(Draw.selectShap == "Square"){
	        		Square obj = new Square();
	        		obj.makeObject(startDrag, p);
	    			Draw.paint.add(obj);
	        	}
	        	else if(Draw.selectShap == "Triangle"){
	        		Triangle obj = new Triangle();
	        		obj.makeObject(startDrag, p);
	    			Draw.paint.add(obj);
	        	}
	        	else if(Draw.selectShap == "Circle"){
	        		Circle obj = new Circle();
	        		obj.makeObject(startDrag, p);
	    			Draw.paint.add(obj);
	        	}
                        else if(Draw.selectShap == "Hexagon"){
	        		Hexagon obj = new Hexagon();
	        		obj.makeObject(startDrag, p);
	    			Draw.paint.add(obj);
	        	}
	        	else if(Draw.selectShap == "fill"){
	        		for(int i = Draw.paint.size() - 1; i>=0; i=i-1){
	        			Paint pt = Draw.paint.get(i);
	        			try{
	        				Class2D s = (Class2D)pt;
	        				if(s.contains(startDrag)){
		        				try{
		        					s.fill(Draw.selectColor);
		        				}
		        				catch(Exception ex){}
			        			break;
		        			}
	        			}
	        			catch(Exception ex){}
	        		}
	        	}
	        	else if(Draw.selectShap == "move"){
	        			if(ptemp.contains(startDrag)){
	        				ptemp.move(startDrag, p);
        					Draw.paint.add(ptemp);
	        			}
	        		}
	        	startDrag = null;
	        	endDrag = null;
	        	repaint();
	        }
	      });

		this.addMouseMotionListener(new MouseMotionAdapter() {
	        public void mouseDragged(MouseEvent e) {
	        	endDrag = new Point(e.getX(), e.getY());
	        	repaint();
	        }
	      });
	}
        public void paint(Graphics g) {
		GraphicAdapter g2 = new GraphicAdapter() {
		};
		g2.setGraphicAdapter(g);
		for (Paint pt : Draw.paint){
			pt.draw(g2);
		}
		if (startDrag != null && endDrag != null) {
			if(Draw.selectShap == "Rectangle"){
				Rectangle obj = new Rectangle();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			}else if(Draw.selectShap == "Square"){
				Square obj = new Square();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			}
			else if(Draw.selectShap == "Circle"){
				Circle obj = new Circle();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			}
			else if(Draw.selectShap == "Triangle"){
				Triangle obj = new Triangle();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			}
                        else if(Draw.selectShap == "Hexagon"){
				Hexagon obj = new Hexagon();
				obj.makeObject(startDrag, endDrag);
				obj.draw(g2);
			}

//        		}
			
		}
        }
        public interface Class2D extends Paint{
	   public void fill(Color color);	//Chuc nang to mau cho doi tuong 2D
	}
}