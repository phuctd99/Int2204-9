
package lab_07;

public abstract class Shape {
    protected String color;
    protected double toado_x;
    protected double toado_y;

    public double getToado_x() {
        return toado_x;
    }

    public void setToado_x(double toado_x) {
        this.toado_x = toado_x;
    }

    public double getToado_y() {
        return toado_y;
    }

    public void setToado_y(double toado_y) {
        this.toado_y = toado_y;
    }
   
    abstract public void del();
    
    
    public Shape(){
        
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Shape(String color, double x, double y){
        this.color = color;
        this.toado_x = x;
        this.toado_y = y;
        
    }

   
}
