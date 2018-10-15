/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Layer {
    private ArrayList<Shape> sha = new ArrayList<>();

    public ArrayList<Shape> getSha() {
        return sha;
    }

    public void setSha(ArrayList<Shape> sha) {
        this.sha = sha;
    }
    
    
    public void delete() {
        for(int i= getSha().size() -1 ; i >=0;i--){
            if(getSha().get(i) instanceof Triangle ){
                getSha().remove(i);
              }
        }
    }

   
    
}
