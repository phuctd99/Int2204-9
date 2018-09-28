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
public class Fraction {
    private int numerator;
    private int denominator;
   
    
    // hàm khởi tạo mặc định
    public Fraction(){
        this.denominator = 1;
        this.numerator = 1;
    }
    
    // khoi tao voi hai tham so dau vao
    public Fraction(int a, int b){ 
        this.numerator = a; // tu so = a
        this.denominator = b;// mau so = b
    }
    
    // khởi tạo sao chép tham số truyền vào là 1 fraction
    public Fraction(Fraction bFraction){ 
        this.numerator = bFraction.numerator;
        this.denominator = bFraction.denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    
    // ucln cua hai so
    public int UCLN(int a, int b){ 
        if(b == 0) return a;
        return UCLN(b, a % b);
    }
    
    // toi gian phan so
    public void normelineFraction(){
        int ucln = this.UCLN(this.getNumerator(), this.getDenominator());
        if(ucln > 1){
            this.setNumerator(this.getNumerator()/ ucln);
            this.setDenominator(this.getDenominator()/ ucln);
        }
    }
    
    
    // tổng hai phân số
    public void add(Fraction aFraction, Fraction bFraction){ 
        //Fraction dFraction = new Fraction();
        this.setNumerator(aFraction.numerator * bFraction.denominator + bFraction.numerator * aFraction.denominator);
        this.setDenominator(aFraction.denominator * bFraction.denominator);
        this.normelineFraction();
        //return dFraction;
    }
    
    // hiệu hai phân số
    public Fraction sub(Fraction aFraction, Fraction bFraction){ 
        Fraction dFraction = new Fraction();
        dFraction.setNumerator(aFraction.numerator * bFraction.denominator - bFraction.numerator * aFraction.denominator);
        dFraction.setDenominator(aFraction.denominator * bFraction.denominator);
        dFraction.normelineFraction();
        return dFraction;
    }    
    
    // tích hai phân số
    public Fraction multiply(Fraction aFraction, Fraction bFraction){
        Fraction dFraction = new Fraction();
        dFraction.setNumerator(aFraction.numerator * bFraction.numerator);
        dFraction.setDenominator(aFraction.denominator * bFraction.denominator);
        dFraction.normelineFraction();
        return dFraction;
    }
    
    // hàm chia hai phân số
    public Fraction divide(Fraction aFraction, Fraction bFraction){ 
        Fraction dFraction = new Fraction();
        dFraction.setNumerator(aFraction.numerator * bFraction.denominator);
        dFraction.setDenominator(aFraction.denominator * bFraction.numerator);
        dFraction.normelineFraction();
        return dFraction;
    }
    
    // hàm in ra phân số theo dạng a / b;
    public String Print(){
        if(this.numerator % this.denominator == 0) return (this.numerator / this.denominator + "");
        return (this.numerator + " / " + this.denominator);
    }
    
    /**
    * Fraction a != Fraction b return true;
     * @param aFraction
     * @param bFraction
     * @return 
    */
    public boolean equals(Fraction aFraction, Fraction bFraction){
        return sub(aFraction, bFraction).numerator == 0;
    }
    
    // hàm main test thử
    public static void main(String[] args) {
        
        Fraction fraction = new Fraction(); // khai báo 1 thực thể của lớp Fraction
        System.out.println("fraction: " + fraction.Print());
        
        // khởi tạo hai phân số a, b
        Fraction aFraction = new Fraction(-3,5);
        Fraction bFraction = new Fraction(6,7);
        System.out.println("return (aFraction == bFraction) = " + new Fraction().equals(aFraction, bFraction));
        
        // khai báo phân số c có giá trị mặc định sau đó tính gán bằng tổng a + b
        Fraction cFraction = new Fraction();
        cFraction.add(aFraction, bFraction);
        System.out.println(aFraction.Print() + " + " + bFraction.Print() + " = " + cFraction.Print());
        
        // khai báo phân số d sau đó tính gán bằng hiệu a - b rồi in ra màn hình
        Fraction dFraction;
        dFraction = fraction.sub(aFraction, bFraction);
        System.out.println(dFraction.Print());
        
        // gán giá trị của c cho phân số d rồi in ra
        dFraction = new Fraction(cFraction);
        System.out.println(dFraction.Print());
        
    }
}
