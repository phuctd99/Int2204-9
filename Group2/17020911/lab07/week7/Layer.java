/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class Layer {

    public ArrayList<Shape> layer = new ArrayList<>();
    public boolean visible;
    public Scanner input = new Scanner(System.in);

    public void removeTriangle() {

        for (int i = 0; i < layer.size(); i++) {
            if (layer.get(i) instanceof Triangle) {
                layer.remove(i);
                i--;
            }
        }
    }
    public void removeCircle() {

        for (int i = 0; i < layer.size(); i++) {
            if (layer.get(i) instanceof Circle) {
                layer.remove(i);
                i--;
            }
        }
    }
    public void removeSquare() {

        for (int i = 0; i < layer.size(); i++) {
            if (layer.get(i) instanceof Square) {
                layer.remove(i);
                i--;
            }
        }
    }
    public void removeRectangle() {

        for (int i = 0; i < layer.size(); i++) {
            if (layer.get(i) instanceof Rectangle) {
                layer.remove(i);
                i--;
            }
        }
    }
    public void removeSameCircle()
    {
        ArrayList<Circle> circlelist = new ArrayList<>();
        for(int i=0;i<layer.size();i++)
        {
            if(layer.get(i) instanceof Circle)
            {
                circlelist.add((Circle)layer.get(i));
            }
        }
        for(int i=0;i<layer.size();i++)
        {
            if(layer.get(i) instanceof Circle)
            {
                layer.remove(i);
                i--;
            }
        }
        for(int i=0;i<circlelist.size();i++)
        {
            if (circlelist.get(i).centerpoint.x == circlelist.get(i + 1).centerpoint.x && circlelist.get(i).radius == circlelist.get(i + 1).radius
                    && circlelist.get(i).centerpoint.y == circlelist.get(i + 1).centerpoint.y ) {
                circlelist.remove(i);
                i--;
        }
        
    }
        for(int i=0;i<circlelist.size();i++)
        {
            layer.add(circlelist.get(i));
        }
}
}