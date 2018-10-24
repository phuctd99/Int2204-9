/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Layer {
    protected boolean visable;

    public boolean isVisable() {
        return visable;
    }

    public void setVisable(boolean visable) {
        this.visable = visable;
    }
    
    ArrayList<Shape> listShape = new ArrayList();
    
    Shape s1 = new Circle("red", 2, 3, 5);
    Shape s2 = new Rectangle("red", 2, 3, 7, 8);
    Shape s3 = new Triangle("red", 0, 0, 5, 6, 7,8);
    Shape s4 = new Square("yelow", 0, 0, 8);
    
       
    public void addLayer(){
        listShape.add(s1);
        listShape.add(s2);
        listShape.add(s3);
        listShape.add(s4);
    }
    
    
   /* ArrayList<Shape> listCircle = new ArrayList<>();
    ArrayList<Shape> listRectangle = new ArrayList<>();
    ArrayList<Shape> listSquare = new ArrayList<>();
    ArrayList<Shape> listTriangle = new ArrayList<>();
    ArrayList<Shape> listHexagon = new ArrayList<>();
    
    
    
    public void tranfer(){
        for(int i = 0; i< listShape.size(); i++){
            if(listShape.get(i) instanceof Circle){
                listCircle.add(listShape.get(i));
            }
            if(listShape.get(i) instanceof Rectangle){
                listRectangle.add(listShape.get(i));
            }
            if(listShape.get(i) instanceof Square){
                listSquare.add(listShape.get(i));
            }
            if(listShape.get(i) instanceof Triangle){
                listTriangle.add(listShape.get(i));
            }
            if(listShape.get(i) instanceof Hexagon){
                listHexagon.add(listShape.get(i));
            }
        } 
    }*/

    public void delsame_Circle(){
        for(int i = 0; i<listShape.size(); i++){
            for(int j = i+1; j< listShape.size(); j++){
                if((listShape.get(i) instanceof Circle) && (listShape.get(j) instanceof Circle) ){
                   if(((Circle) listShape.get(i) ).compare_circle((Circle) listShape.get(j) ) == true){
                       listShape.remove(j);
                   }      
                }
                else if((listShape.get(i) instanceof Rectangle && (listShape.get(j) instanceof Rectangle))){
                    if(((Rectangle) listShape.get(i)).compare_rectangle((Rectangle) listShape.get(j))== true){
                        listShape.remove(j);
                    }
                }
                else if((listShape.get(i) instanceof Square) && (listShape.get(j) instanceof Square)){
                    if(((Square) listShape.get(i)).compare_square((Square) listShape.get(j))==true){
                        listShape.remove(j);
                    }
                }
                else if(listShape.get(i) instanceof  Triangle && listShape.get(j) instanceof Triangle){
                    if(((Triangle) listShape.get(i)).compare_triangle((Triangle) listShape.get(j)) == true){
                        listShape.remove(j);
                    }
                }             
            }
            
        }
            
    }
    public void delShape_Rectangle(){
        for (int i = 0; i < listShape.size(); i++){
            if(listShape.get(i) instanceof Rectangle)
                listShape.remove(i);
    }
    }
    public Shape getelement(int i){
        return listShape.get(i);
    }
    
    public void addelement(Shape s){
        listShape.add(s);
    }
    
    public void delShape_Circle(){
        for(int i = listShape.size(); i>0 ; i--){
            if(listShape.get(i) instanceof Circle)
                listShape.remove(i);
        }
    }
    public void delShape_Trianglr(){
        for(int i = listShape.size(); i>=0; i--){
            if(listShape.get(i) instanceof Triangle)
                listShape.remove(i);
        }
    }
    public void delShape_Square(){
        for(int i = listShape.size(); i>=0; i--){
            if(listShape.get(i) instanceof Square)
                listShape.remove(i);
    }
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(Shape element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
