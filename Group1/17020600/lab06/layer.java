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
    protected String tenlayer;

    public String getTenlayer() {
        return tenlayer;
    }

    public void setTenlayer(String tenlayer) {
        this.tenlayer = tenlayer;
    }
    public ArrayList<shape> Alayer= new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ten Layer: ");
	tenlayer = scan.nextLine();
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
    public void outputLayer() {
        System.out.println("Ten cua layer: " + getTenlayer());
	for(int i = 0 ; i < Alayer.size() ;i++) {
            Alayer.get(i).output();
	}
	}
}
