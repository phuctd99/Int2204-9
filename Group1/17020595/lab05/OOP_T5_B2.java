
package oop_t5_b2;

public class OOP_T5_B2 { 
    public static void main(String[] args) {
        Circle tamGiac =new Circle();        
        System.out.println(tamGiac.chuVi() + " va " + tamGiac.dienTich());
    }   
}
class shape{
    String color = "red";
    boolean filled = true;
    shape(){
        
    }
    shape(String color, boolean filled){
        
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
