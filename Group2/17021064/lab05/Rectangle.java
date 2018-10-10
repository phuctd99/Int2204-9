public class Rectangle extends Shape{
    double width ;
    double length ;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double w, double l ){
        this.width = w ;
        this.length = l ;
    }
    public Rectangle(double w, double l , String c , boolean f ){
        super(c, f);
        this.width = w ;
        this.length = l;

    }
    public double getWidth(){
        return width ;
    }
    public void setWidth(double w){
        this.width = w;
    }
    public double getLength(){
        return length ;
    }
    public void setLength(double l){
        this.length = l;
    }
    public double getArea(){
        return this.width*this.length ;
    }
    public double getPerimeter(){
        return 2*(this.width + this.length) ;
    }
    @Override
    public String toString(){
        return "Diện tích: "+this.getArea()+ " | Chu vi: " + this.getPerimeter() + " | màu sắc:  " + color+" | filled: "+filled+" | w: "+width+" | h: "+length;
    }
}


