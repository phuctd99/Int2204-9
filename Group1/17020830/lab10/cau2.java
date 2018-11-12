
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class cau2 {

    public static double[] sinhsongaunhien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu");
        int sz = sc.nextInt();
        double[] list = new double[sz];
        for(int i = 0; i < sz; i++){
            Random rd = new Random();
            double bienthuc = rd.nextDouble();
            int biennguyen = -500 + rd.nextInt(1000);
            double bien = biennguyen+bienthuc;
            
            list[i] = bien;
           
        }
        return list;
    }
    
    
    public static void sort(){
        double tg =0.0;
        double[] list = sinhsongaunhien();
        for(int i = 0; i < list.length ; i++ ){
            for(int j = i+1; j < list.length; j++ ){
                if(list[i] > list[j]){
                    
                    tg = list[i];
                    list[i] = list[j];
                    list[j] = tg;                    
                }
            }
        }
        for(int i= 0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        sort();
        
        }
                
        
    }
    


