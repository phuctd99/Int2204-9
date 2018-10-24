/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Layer {
    private boolean visible ;// hien thi 
    private ArrayList<Shape> shapeArrayList = new ArrayList<>();
    public boolean getVisible(){
         return  visible ;
    }
    public void setVisible(boolean v){
        this.visible = v ;
    }
    public ArrayList<Shape> getShapeArrayList() {
        return shapeArrayList;
    }

    public void setShapeArrayList(ArrayList<Shape> shapeArrayList) {
        this.shapeArrayList = shapeArrayList;
    }

    public void delete() {
        for(int i= getShapeArrayList().size() -1 ; i >=0;i--){
            if(getShapeArrayList().get(i) instanceof Triangle ){// intanceof :so sánh kiểu
                getShapeArrayList().remove(i);
            }
        }
    }
    public boolean sameShape(Shape a , Shape b){
         if (a instanceof Circle && b instanceof Circle) {
            if (((Circle)a).SameCircle((Circle)b)) {
                return true;
            }
        }
        
        if (a instanceof Rectangle && b instanceof Rectangle) {
            if (((Rectangle)a).sameRectangle((Rectangle)b)) {
                return true;
            }
        }
        
        if (a instanceof Triangle && b instanceof Triangle) {
            if (((Triangle)a).sameTriangle((Triangle)b)) {
                return true;
            }
        }
        
        if (a instanceof Square && b instanceof Square) {
            if (((Square)a).sameSquare((Square) b)) {
                return true;
            }
        }
       if (a instanceof Hexagon && b instanceof Hexagon) {
            if (((Hexagon)a).sameHexagon((Hexagon) b)) {
                return true;
            }
        }
        return false;   
    }
    
    // xóa hình trùng nhau 
     public void removeShape() {
        for (int i = shapeArrayList.size() -1; i >=0; i--) {
            for (int j = 0; j<shapeArrayList.size() ; j++) {
                if ((sameShape(shapeArrayList.get(i), shapeArrayList.get(j))) == true) {
                    shapeArrayList.remove(j);
                    j--;
                }
            }
        }
    }
}