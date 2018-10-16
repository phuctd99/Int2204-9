/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.lab6;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Diagram {
    public ArrayList<Layer> layerArr = new ArrayList<> ();
    public ArrayList<Layer> input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của Diagram:");
        int sz = scan.nextInt();
        
        for(int i = 0; i < sz; i++){
            Layer layer = new Layer();
            layer.input();
            layerArr.add(layer);
        }
        return layerArr;
    }
    public ArrayList<Layer> RemoveLayer(){
        for(int i = 0; i < layerArr.size(); i++){
            layerArr.get(i).RemoveCircle();
        }
        return layerArr;
    }
    public void printDiagram() {
        
        for(int i = 0; i < layerArr.size(); i++){
            layerArr.get(i).printLayer();
        }
    }
    public static void main(String[] args) {
        Diagram d=new Diagram();
        d.input();
        d.RemoveLayer();
        d.printDiagram();
    }
}
