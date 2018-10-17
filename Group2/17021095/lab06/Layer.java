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
public class Layer {
    public ArrayList<Shape> lr = new ArrayList();    
    public void  DeleteTriangle(){
        for(int i=0; i<lr.size(); i++ ){
            if(lr.get(i) instanceof Triangle){
                lr.remove(i);
            i--;
        }
    }
}
}
