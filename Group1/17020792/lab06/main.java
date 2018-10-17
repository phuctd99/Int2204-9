/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;



/**
 *
 * @author CCNE
 */
public class main {
    
    public static void main(String[] args){
            Diagram dg = new Diagram();
            Layer lay1 = new Layer();
            Layer lay2 = new Layer();
            
            Cicrle cr = new Cicrle(2, "red", true);
            Rectangle rec = new Rectangle(2, 2, "blue", true);
            Square sq = new Square(3, "yellow", true);
            Triangle tri = new Triangle(1, 2, 3);
            lay1.getSha().add(cr);
            lay1.getSha().add(rec);
            lay1.getSha().add(sq);
            lay1.getSha().add(tri);
            
            lay2.getSha().add(sq);
            lay2.getSha().add(rec);
            
            dg.getLayer().add(lay1);
            dg.getLayer().add(lay2);
            dg.delete();
            lay1.delete();
            
        for(int i = 0; i < dg.getLayer().size();i++){
            for(int j = 0; j < dg.getLayer().get(i).getSha().size();j++)
                System.out.println(dg.getLayer().get(i).getSha().get(j).toString());
                
                
            }
        }
}
