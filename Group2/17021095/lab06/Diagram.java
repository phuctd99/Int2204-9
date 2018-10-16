/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btt6;

import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class Diagram {
  public ArrayList<Layer> dg = new ArrayList();
   public void DeleteCircle(){
       for(int i=0; i<dg.size(); i++){
          for(int j=0; j<dg.get(i).lr.size(); j++){
               if(dg.get(i).lr.get(j) instanceof Circle){
               dg.get(i).lr.remove(j);
               j--;
           }
       }
   }
}
}
