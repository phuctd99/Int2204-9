/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author hung
 */
import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> list = new ArrayList<Layer>();

    /**
     *
     * @param dia
     * @return
     */
    public ArrayList<Layer> removeCircle (ArrayList<Layer> dia){
        for(int i = 0; i < dia.size(); i++){
            list.get(i).removeCircle();
        }
        return dia;
    }
}
