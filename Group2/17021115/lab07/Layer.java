package Week7;

import java.awt.Graphics;
import java.awt.print.Printable;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layer extends JPanel{
	private ArrayList<Shape> listShape;
	private boolean visible;

	public Layer() {
		this.listShape = new ArrayList<>();
		this.visible = true;
	}

	public ArrayList<Shape> getListShape() {
		return listShape;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public void setListShape(ArrayList<Shape> listShape) {
		this.listShape = listShape;
	}

	public void removeAllTriangle() {
		for (int i = listShape.size() - 1; i >= 0; i--) {
			if (listShape.get(i) instanceof Triangle) {
				listShape.remove(i);
			}
		}
		System.out.println("Delete success!");
	}

	public void removeSameShape() {
		ArrayList<Shape> listTemp = new ArrayList<>();
		for (int i = 0; i < listShape.size(); i++) {
			if (!listTemp.contains(listShape.get(i))) {
				listTemp.add(listShape.get(i));
			}
		}
		listShape.clear();
		listShape.addAll(listTemp);
	}
	
	
	/*
	 	Phân chia loại hình
	 */
	public void phanChiaLoailistShape(ArrayList<Shape> listRe, ArrayList<Shape> listSquare, ArrayList<Shape> listCir, ArrayList<Shape> listTri,
			ArrayList<Shape> listHex) {
		for (Shape shape : listShape) {
			if (shape instanceof Square) {
				listSquare.add(shape);
			} else if (shape instanceof Rectangle) {
				listRe.add(shape);
			}
			if (shape instanceof Circle) {
				listCir.add(shape);
			}
			if (shape instanceof Triangle) {
				listTri.add(shape);
			}
			if (shape instanceof Hexagon) {
				listHex.add(shape);
			}
		}
	}
	public void drawShape(Graphics g){
		super.paint(g);
        for(int i=0; i<listShape.size(); i++){
            
            if(listShape.get(i) instanceof Rectangle){
               Rectangle rect = (Rectangle) listShape.get(i);
               g.drawRect(rect.getViTri().getX(), rect.getViTri().getY(), rect.getChieuDai(), rect.getChieuRong());
            }
            
            if(listShape.get(i) instanceof Circle){
              Circle cir = (Circle) listShape.get(i);
               g.drawOval(cir.getsetToaDoTam().getX(),cir.getsetToaDoTam().getY(), 2*cir.getRadius(), 2*cir.getRadius());
            }
            
            if(listShape.get(i) instanceof Square){
               Square sqa = (Square) listShape.get(i);
               g.drawRect(sqa.getViTri().getX(), sqa.getViTri().getY(), sqa.getSide(), sqa.getSide());
            }
            
            if(listShape.get(i) instanceof Triangle){
               Triangle tri = (Triangle) listShape.get(i);
               g.drawLine(tri.getDiemA().getX(), tri.getDiemA().getY(), tri.getDiemB().getX(), tri.getDiemB().getY());
               g.drawLine(tri.getDiemB().getX(), tri.getDiemB().getY(), tri.getDiemC().getX(), tri.getDiemC().getY());
               g.drawLine(tri.getDiemC().getX(), tri.getDiemC().getY(), tri.getDiemA().getX(), tri.getDiemA().getY());
               
            }
            
        }
    }
	
}