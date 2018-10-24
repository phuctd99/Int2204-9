/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btt6;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class Diagram extends JPanel {
  public ArrayList<Layer> dg = new ArrayList();
  
  // xóa hình Circle
   public void DeleteCircle(){
       for(int i=0; i<dg.size(); i++){
          for(int j=0; j<dg.get(i).lr.size(); j++){
               if(dg.get(i).lr.get(j) instanceof Circle){
               dg.get(i).lr.remove(j);
           }
               j--;
       }
   }      
}
   // chuyển từng loại hình vẽ vào từng đối tượng Layer.
   public void layerSort(){
       ArrayList<Layer> dg1 = new ArrayList();
       for(int i= 0; i<dg.size(); i++){
           for(int j=0; j<dg.get(i).lr.size(); j++){
               if(dg.get(i).lr.get(j) instanceof Rectangle){
                   dg1.get(0).lr.add(dg.get(i).lr.get(j));
               }
               if(dg.get(i).lr.get(j) instanceof Square){
                   dg1.get(1).lr.add(dg.get(i).lr.get(j));
               }
               if(dg.get(i).lr.get(j) instanceof Triangle){
                   dg1.get(2).lr.add(dg.get(i).lr.get(j));
               }
               if(dg.get(i).lr.get(j) instanceof Circle){
                   dg1.get(3).lr.add(dg.get(i).lr.get(j));
               }
               if(dg.get(i).lr.get(j) instanceof Hexagon){
                   dg1.get(3).lr.add(dg.get(i).lr.get(j));
               }
           }
       }
       dg = dg1;
   }
   //hàm vẽ lớp Diagram
   public void PaintDiagram(Graphics s, Diagram dg1){
       
       for(int i =0; i<dg1.dg.size(); i++){
           if(dg1.dg.get(i).getVisible() == true){
           for(int j = 0; j<dg1.dg.get(i).lr.size(); j++){
               
               if(dg1.dg.get(i).lr.get(j) instanceof Rectangle){                                   
                     dg1.dg.get(i).lr.get(j).paintShape(s);                   
               }
               if(dg1.dg.get(i).lr.get(j) instanceof Square){
                     dg1.dg.get(i).lr.get(j).paintShape(s);
               }
               if(dg1.dg.get(i).lr.get(j) instanceof Triangle){                  
                    dg1.dg.get(i).lr.get(j).paintShape(s);
                    
               }
               if(dg1.dg.get(i).lr.get(j) instanceof Circle){
                    dg1.dg.get(i).lr.get(j).paintShape(s);
               }
               if(dg1.dg.get(i).lr.get(j) instanceof Hexagon){
                    dg1.dg.get(i).lr.get(j).paintShape(s);
               }
                    
           }
       }
   }
   }
       // tạo bản vẽ
       public void DoDiagram(Graphics g){
           Diagram d = new Diagram();
           Location O = new Location(400,400);
           Location x1 = new Location(100,300);
           Location x2 = new Location(200,100);
           Circle c = new Circle(Color.BLUE,O,200);
           Triangle t = new Triangle(Color.BLACK,O,x1,x2);
           Hexagon h = new Hexagon(Color.GRAY,x1,50);
           Layer l = new Layer(true);
           l.lr.add(c);
           l.lr.add(t);
           //l.lr.add(h);
           d.dg.add(l);    
           l.deleteSame();
           PaintDiagram(g,d);
       }                  
   
   //hàm thực thi 
    @Override
    public void paint(Graphics s){  
       setBackground(Color.WHITE);
       DoDiagram(s);
    }
   
}
