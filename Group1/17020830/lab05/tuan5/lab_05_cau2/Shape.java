// Lớp Circle có thể kế thừa được từ lớp Shape mà không phải lớp Rectangle
// Vì lớp Circle và lớp Rectangle cùng loại bình đẳng với nhau.


package lab_05_cau2;


public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
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
    
    public void Shape(){
        
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
        
    @Override
    public String toString(){
        return color+" "+filled; 
    }
    }
    
 
