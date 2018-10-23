/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Diagram {
    Layer Circle_1 = new Layer();
    Layer Rectangle_1 = new Layer();
    Layer Square_1 = new Layer();
    Layer Triangle_1 = new Layer();
    Layer Hexagon_1 = new Layer();
    
    
    ArrayList<Layer> listlayer = new ArrayList<>();
    
    public void input(int n) {
        for(int i = 0; i < n; i++) {
            Layer layer = new Layer();
            layer.input();
            listlayer.add(layer);
        }
    }
    
    public void output() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++) {
                listlayer.get(i).getLayer().get(j).output();
            }
        }
    }
    
    public void removeCircleDiagram() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++) {
                if (listlayer.get(i).getLayer().get(j) instanceof Circle)
                listlayer.get(i).getLayer().remove(j);
                
            }
        }
    }
    
    public void inLayer() {
        for(int i = 0; i < listlayer.size(); i++){
            for(int j = 0; j < listlayer.get(i).layer.size(); j++){
                if(listlayer.get(i).layer.get(j) instanceof Circle){
                    Circle_1.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Rectangle){
                    Rectangle_1.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Square){
                    Square_1.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Triangle){
                    Triangle_1.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Hexagon){
                    Hexagon_1.layer.add(listlayer.get(i).layer.get(j));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Diagram di = new Diagram();
        di.input(n);
        di.removeCircleDiagram();
        di.output();
    }
}
