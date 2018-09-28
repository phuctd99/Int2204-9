/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author CACLV
 */
public class Complex {
    private int imaginary; // phần thảo của số phức
    
    private int real; // phần ảo của số phức
    
    public Complex() {} // contructor mặc định
    
    // contructor hai tham số truyền vào
    public Complex(int imaginary, int real) { 
        this.imaginary = imaginary;
        this.real = real;
    }
    
    // contructor khơi tạo sao chép
    public Complex(Complex complex) { 
        this.imaginary = complex.imaginary;
        this.real = complex.real;
    }
    
    // các phương thức getter/ setter
    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }
    
    // hàm cộng hai số phức kết quả là số phức hiện tại
    public void add(Complex complex1) {
        this.imaginary += complex1.imaginary;
        this.real += complex1.real;
    }
    
    // hàm trừ hai số phức kết quả là số phức hiện tại
    public void sub(Complex complex1) {
        this.imaginary -= complex1.imaginary;
        this.real -= complex1.real;
    }
    
    // hàm tính modul của số phức
    public void modul(){
        System.out.println(Math.sqrt(this.imaginary * this.imaginary + this.real * this.real));
    }
    
    // hàm in ra số phức hiện tại
    public void print(){
        System.out.println(this.imaginary + " + " +  this.real + "i");
    }
    
    
    public static void main(String[] args) {
        Complex complex = new Complex(2, 3);// khỏi tạo 1 số phức vói hai tham số truyền vào
        
        // in ra số phức vừa khởi tạo và modul của nó
        complex.print(); 
        complex.modul();
        
        // nhân đôi chính đối tượng vừa tạo ra và in ra các thông tin
        complex.add(complex);
        complex.print();
        complex.modul();
        
        // trừ đi 1 số phức và in ra các thông tin
        complex.sub(new Complex(2, 3));
        complex.print();
        complex.modul();
    }
}
