
package tuan_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Diagram {
    Layer Circle = new Layer();
    Layer Rectangle = new Layer();
    Layer Square = new Layer();
    Layer Triangle = new Layer();
    Layer Hexagon = new Layer();
    
    
    ArrayList<Layer> listlayer = new ArrayList<>();
    
    public void intoado(int n) {
        for(int i = 0; i < n; i++) {
            Layer layer = new Layer();
            layer.input();
            listlayer.add(layer);
        }
    }
    
    public void outtoado() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++) {
                listlayer.get(i).getLayer().get(j).output();
            }
        }
    }
    
    public void xoaCircleDiagram() {
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
                    Circle.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Rectangle){
                    Rectangle.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Square){
                    Square.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Triangle){
                    Triangle.layer.add(listlayer.get(i).layer.get(j));
                } else if(listlayer.get(i).layer.get(j) instanceof Hexagon){
                    Hexagon.layer.add(listlayer.get(i).layer.get(j));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Diagram di = new Diagram();
        di.intoado(n);
        di.xoaCircleDiagram();
        di.outtoado();
    }
}