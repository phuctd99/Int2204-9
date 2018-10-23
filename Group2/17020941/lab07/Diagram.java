package oop_tuan6;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Diagram extends JFrame{
	protected List<Layer> listLayer;

    public Diagram() {
        this.listLayer = new ArrayList<>();
    }

    public void addLayer(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeAllCircle() {
        for (int i = 0; i < listLayer.size(); i++) {
            this.listLayer.get(i).removeAllCircle();
    	}
    }

    public void showAllLayer() {
        for (Layer layer : this.listLayer) {
        	JFrame jr = new JFrame();
        	jr.setSize(800, 800);
        	jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	jr.setVisible(true);
            layer.showAllShapes(jr);
        }
    }
    public void removeSameShape() {
    	for (int i = 0; i < listLayer.size(); i++) {
    		this.listLayer.get(i).removedSameshape();
    	}
    }
    
    public void printShape() {
    	// tao 5 jframe hien thi 5 loai hinh
    	JFrame jrRe = new JFrame();
    	JFrame jrSquare = new JFrame();
    	JFrame jrCircle = new JFrame();
    	JFrame jrTriangle= new JFrame();
    	JFrame jrHexagon = new JFrame();
    	// set cac thong so cho jframe
    	jrRe.setSize(800, 800);
    	jrRe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jrRe.setTitle("bang hinh chu nhat");
    	jrRe.setVisible(true);
    	
    	jrSquare.setSize(800, 800);
    	jrSquare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jrSquare.setTitle("bang hinh vuong");
    	jrSquare.setVisible(true);
    	
    	jrCircle.setSize(800, 800);
    	jrCircle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jrCircle.setVisible(true);
    	jrCircle.setTitle("bang hinh tron");
    	
    	jrTriangle.setSize(800, 800);
    	jrTriangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jrTriangle.setVisible(true);
    	jrTriangle.setTitle("bang tam giac");
    	
    	jrHexagon.setSize(800, 800);
    	jrHexagon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jrHexagon.setVisible(true);
    	jrHexagon.setTitle("bang luc giac");
    	
    	// tao cac list hinh de phan loai
    	List<Shape> listRe = new ArrayList<>();
    	List<Shape> listSquare = new ArrayList<>();
    	List<Shape> listCircle = new ArrayList<>();
    	List<Shape> listTriangle = new ArrayList<>();
    	List<Shape> listHexagon = new ArrayList<>();
    	for (Layer layer : this.listLayer) {
    		layer.showShape(listRe, listSquare, listCircle, listTriangle, listHexagon);
    	}
    	
    	print printRe = new print(listRe);
    	jrRe.add(printRe);
    	print printSquare = new print(listSquare);
    	jrSquare.add(printSquare);
    	print printCircle = new print(listCircle);
    	jrCircle.add(printCircle);
    	print printTriangle = new print(listTriangle);
    	jrTriangle.add(printTriangle);
    	print printHexagon = new print(listHexagon);
    	jrHexagon.add(printHexagon);
    }
}
