
public class Rectangle extends Shape{
    protected double width = 1.0;
    public double length = 1.0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    Rectangle ()
    {
        
    }
    Rectangle(double width,double length)
    {
        this.width =width;
        this.length = length;
    }
    Rectangle ( double width,double length,String color,boolean filled)
    {
        this.width= width;
        this.length = length;
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getPerimeter()
    {
        return ((this.length + this.width) *2);
    }
    public double getArea()
    {
        return (this.length * this.width);
    }
    public String toString()
    {
        return super.toString() +"\n"+this.getArea() +"\n" + this.getPerimeter();
    }
    public static void main(String[] args) {
        Rectangle R= new Rectangle(1.0,3.0,"red",true);
        //System.out.println(C.getPerimeter());
        //System.out.println(C.getArea());
        System.out.println(R.toString());
    }
    
}
