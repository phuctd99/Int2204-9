package oop_tuan6;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Layer {
	
	 	private String name;
		private List<Shape> listShape;
		private boolean visiable; // bien kiem soat hien thi hay khong
		
		
	    public boolean isVisiable() {
	    	return visiable;
	    }

		public void setVisiable(boolean visiable) {
			this.visiable = visiable;
		}
	    public Layer(String name) {
	        this.listShape = new ArrayList<>();
	        this.name = name;
	        visiable = true;
	    }

	    public void addShape(Shape shape) {
	        this.listShape.add(shape);
	    }

	    public void removeAllTriangle() {
	        for (int i = 0; i < listShape.size(); i++) {
	            if (listShape.get(i) instanceof Triangle) {
	                listShape.remove(i);
	                i--;
	            }

	        }
	    }

	    public void removeAllCircle() {
	        for (int i = 0; i < listShape.size(); i++) {
	            if (listShape.get(i) instanceof Circle) {
	                listShape.remove(i);
	                i--;
	            }
	        }
	    }
	    
	    public void removedSameshape() {
	    	for (int i = 0; i < listShape.size() - 1; i++) {
	    		for (int j = i + 1; j < listShape.size(); i++) {
	    			if (listShape.get(i).equals(listShape.get(j)) == true && i != j) {
	    				listShape.remove(i);
	    				i--;
	    			}
	    			
	    		}
	    	}
	    }
	    // hien thi tat ca cac hinh
	    public void showAllShapes(JFrame frame) {
	        if (visiable == true) {
	        	print newP = new print(listShape);
	        	frame.add(newP);
	        }    	
	    }
	    // phan loai cac loai hinh
	    public void showShape(List<Shape> listRe, List<Shape> listSquare, List<Shape> listCircle, List<Shape> listTriangle
	    					,  List<Shape> listHexagon) {
	    	for (Shape shape : listShape) {
	    		if (shape instanceof Square) {
	    			listSquare.add(shape);
	    		} 
	    		else if (shape instanceof Rectangle) {
	    			listRe.add(shape);
	    		}
	    		if (shape instanceof Circle) {
	    			listCircle.add(shape);
	    		}  
	    		if (shape instanceof Triangle){
	    			listTriangle.add(shape);
	    		}
	    		if (shape instanceof Hexagon){
	    			listHexagon.add(shape);
	    		}
	    	}
	    }
 	    @Override
	    public String toString() {
	        return "Layer: " + name ;
	    }
}
