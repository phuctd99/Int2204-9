public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double size){
        super(size, size);
    }
    public Square(double size , String c , boolean f ){
        super(size, size, c, f);
    }
    public double getSize(){
        return super.getWidth();
    }
    public void setSize(double size){
        this.width = size ;
        this.length = size ;
    }
    @Override
    public void setWidth(double size){
        super.setWidth(size);
        super.setLength(size);
    }
    @Override
    public void setLength(double size){
        super.setWidth(size);
        super.setLength(size);
    }
    @Override
    public String toString(){
        return "Diện tích: " + this.getArea()+ " | Chu vi: " + this.getPerimeter() + " |Màu sắc: " + color+" | filled:  "+filled+" "+width;
    }
}
