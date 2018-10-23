/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class layer {
    private boolean visible = false;
    public ArrayList<shape> Alayer= new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap thuoc tinh visiable(true/false): ");
	visible = scan.nextBoolean();
        int luachon;
        do{
            System.out.println("1.circle");
            System.out.println("2.rectangle");
            System.out.println("3.square");
            System.out.println("4.triange");
            do{
                System.out.println("nhap lua chon");
                luachon = scan.nextInt();
                if(luachon > 0 || luachon < 6)
                    System.out.println("lua chon k hop le");
        }while (luachon > 6 || luachon < 0);
            if(luachon == 1){
                shape H = new circle();
                H.input();
                Alayer.add(H);
            }
            if(luachon == 1){
                shape H = new rectangle();
                H.input();
                Alayer.add(H);
            }
            if(luachon == 1){
                shape H = new square();
                H.input();
                Alayer.add(H);
            }
            if(luachon == 1){
                shape H = new triangle();
                H.input();
                Alayer.add(H);
            }
        }while(luachon != 0);
    }  
    public void removeTriangle() {
		
	for(int i = 0 ; i < Alayer.size() ; i++) {
            if(Alayer.get(i) instanceof triangle) {
		Alayer.remove(i);
		--i;
            }
	}
    }
    public void removecircle() {
	for(int i = 0 ; i < Alayer.size() ; i++) {
            if(Alayer.get(i) instanceof circle) {
		Alayer.remove(i);
		--i;}
		}
    }
    public boolean sameShape(shape s1, shape s2) {
		
        if(s1 instanceof circle && s2 instanceof circle) {
            if(((circle)s1).sameCircle((circle)s2)){
                return true;
            }
	}
		
        if(s1 instanceof rectangle && s2 instanceof rectangle){
            if(((rectangle)s1).sameRectangle((rectangle)s2)){
                return true;
            }
        }
		
         if(s1 instanceof square && s2 instanceof square){
            if(((square)s1).sameSquare((square)s2)){
                return true;
            }
        }
         
         if(s1 instanceof triangle && s2 instanceof triangle){
            if(((triangle)s1).sameTriangle((triangle)s2)){
                return true;
            }
        }
         
         if(s1 instanceof hexagon && s2 instanceof hexagon){
            if(((hexagon)s1).sameHexagon((hexagon)s2)){
                return true;
            }
        }
		
		
		return false;
	}
    public void removeShape(){
        for(int i = 0 ; i < Alayer.size() - 1; i++){
            for(int j = i + 1; j < Alayer.size()-1; j++)
            {
                if(sameShape(Alayer.get(i), Alayer.get(j)) == true) {
                    Alayer.remove(j);
                    j--;
		}
            }
        }
            
    }
    public void outputLayer() {
	for(int i = 0 ; i < Alayer.size() ;i++) {
            Alayer.get(i).output();
	}
	}
}
