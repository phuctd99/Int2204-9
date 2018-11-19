/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11;

import java.util.Comparator;

/**
 *
 * @author CCNE
 */
public class PS implements Comparable<PS> {
    private int tu;
    private int mau;
    
    public PS(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public  void In(){
        System.out.print(tu+"/"+mau);      
    }
     @Override
    public int compareTo(PS s) {
        int a = s.getTu()*this.getMau();
        int b = s.getMau()*this.getTu();
        return b-a;
    }   
}
    

