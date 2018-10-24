/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Admin
 */
public class Hexagon extends Shape{
    private toaDo A1 , A2 , A3 , A4 , A5 ,A6 ;
    public toaDo getA1() {
        return A1;
    }
    public void setA1(toaDo a1) {
        this.A1= a1;
    }
    //
     public toaDo getA2() {
        return A2;
    }
    public void setA2(toaDo a2) {
        this.A1= a2;
    }
    //
     public toaDo getA3() {
        return A3;
    }
    public void setA3(toaDo a3) {
        this.A3= a3;
    }
    //
     public toaDo getA4() {
        return A4;
    }
    public void setA4(toaDo a4) {
        this.A4= a4;
    }
    //
     public toaDo getA5() {
        return A5;
    }
    public void setA5(toaDo a5) {
        this.A5= a5;
    }
    //
     public toaDo getA6() {
        return A6;
    }
    public void setA6(toaDo a6) {
        this.A6= a6;
    }
    
    public boolean  sameHexagon(Hexagon h){
       if(h.getA1().same(this.A1) == true && h.getA2().same(this.A2) == true
          && h.getA3().same(this.A3) == true && h.getA4().same(this.A4) == true
          && h.getA5().same(this.A5) == true && h.getA6().same(this.A6) == true) return true ;
       else return false ;
    }
}
