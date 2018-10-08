class Rectangle extends Shape {
    double width;
    double length;
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return  this.length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        if(filled){
            return this.width*this.length;
        }
        else
            return 0;
    }
    public double getPerimeter(){
        return this.length*2 + this.width*2;
    }
    public String toString(){
        return "\nHình chữ nhật màu "+ color + " có chiều dài " + String.valueOf(getLength())
                + ", chiều rộng " + String.valueOf(getWidth())
                + "\nDiện tích là " + String.valueOf(getArea())
                + "\nChu vi là " + String.valueOf(getPerimeter());
    }
}