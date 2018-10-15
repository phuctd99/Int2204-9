/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pc
 */
public class Square extends Shape {
    protected int length;
    
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    
    @Override
    public void inputtoado(){
//        super.input();
        System.out.println("Nhap toa do Square : ");
        length = super.scan.nextInt();
    }
    
    @Override
     public void outputtoado(){
//        super.output();
        System.out.println("toa do cua Square  la: " +" ("+ " "+length+" , " + length+" , "+length+" , "+ length+" "+")");
        System.out.println("kich thuoc cua Square la:"+ length*length);
    }
     

}
