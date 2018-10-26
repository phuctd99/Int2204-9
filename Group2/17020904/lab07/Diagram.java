/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;


import java.util.ArrayList;


/**
 *
 * @author SONY
 */
public class Diagram  {
    Layer Rec = new Layer();
    Layer Squ = new Layer();
    Layer Cri = new Layer();
    Layer Tri = new Layer();
    Layer Hex = new Layer();
    
  private ArrayList<Layer> dg = new ArrayList();
 
  // xóa hình Circle
   public void DeleteCircle(){
       for(int i=0; i<dg.size(); i++){
          for(int j=0; j<dg.get(i).als.size(); j++){
               if(dg.get(i).als.get(j) instanceof Circle){
               dg.get(i).als.remove(j);
           }
               j--;
       }
   }      
}
   
   // chuyển từng loại hình vẽ vào từng đối tượng Layer.
   public void insertToLayer(){
      
       for(int i= 0; i<dg.size(); i++){
           
            for(int j = 0 ; j < dg.get(i).als.size() ; j++) {
                
		if(dg.get(i).als.get(j) instanceof Circle) {
                    
                    Cri.als.add(dg.get(i).als.get(j));
		}
                
		else if(dg.get(i).als.get(j) instanceof Rectangle) {
					
                    Rec.als.add(dg.get(i).als.get(j));
		}
                
		else if(dg.get(i).als.get(j) instanceof Square) {
					
                    Squ.als.add(dg.get(i).als.get(j));
		}
                
		else if(dg.get(i).als.get(j) instanceof Triangle) {
					
                    Cri.als.add(dg.get(i).als.get(j));
		}
                
                else if(dg.get(i).als.get(j) instanceof Hexagon) {
					
                    Hex.als.add(dg.get(i).als.get(j));
		}
				
            }
			
        }
 }

   
   

   
}
