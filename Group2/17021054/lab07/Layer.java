/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;
import java.util.Scanner;

public class Layer {
    private String name;
    private boolean visible;
    ArrayList<Shape> layer = new ArrayList<>();

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
    public ArrayList<Shape> getLayer() {
        return layer;
    }
     public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
     }
        Scanner scan = new Scanner(System.in);
    public void nhapLayer(){
        System.out.println("nhap so phan tu cua layer");
        int n = scan.nextInt();
        System.out.println("menu:");
        System.out.println("nhap 0 neu muon them Circle");
        System.out.println("nhap 1 neu muon them Rectangle");
        System.out.println("nhap 2 neu muon them Square");
        System.out.println("nhap 3 neu muon them Triangle");
        for(int i =0;i<n;i++){
            int a = scan.nextInt();
            switch(a){
                case 0:
                    Circle c = new Circle();
                    layer.add(c);
                    break;
                case 1:
                    Shape rg = new Rectangle();
                    
                    layer.add(rg);
                    break;
                case 2:
                    Shape sq = new Square();
                    
                    layer.add(sq);
                    break;
                case 3:
                    Shape tr = new Triangle();
                    
                    layer.add(tr);
                    break;
                    default: break;
            }
        } 
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
     public void removeCircle(){
        for(int i = 0; i < layer.size(); i++){
            if(getLayer().get(i) instanceof Circle) {
                getLayer().remove(i);
                i--;
            }
        }
    }
    public void removeCircle(Circle c1, Circle c2){
        if(c1.sameCircle(c2) == true){
            for(int i = 0; i < layer.size(); i++){
            if(Circle c1 instanceof (Circle) getLayer().get(i)){
                getLayer().remove(i);
                i--;
            }
            if(Circle c2 instanceof (Circle) getLayer().get(i)){
                getLayer().remove(i);
                i--;
            }
            
        }
        }
    }
}
