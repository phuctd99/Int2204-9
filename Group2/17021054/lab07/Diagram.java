/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Diagram {
    
    private Layer layer;
    public Diagram(Layer layer){
        this.layer = layer;
    }

    ArrayList<Layer> layers = new ArrayList<>();
}
