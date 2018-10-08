class Circle extends Shape {
    final double PI = 3.141592;
    double radius; // bán kính
    public Circle(){ //vòng tròn
        super();
        this.radius = 1.0;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){ // diện tích
        if(filled) {
            return this.radius * this.radius * PI;
        }
        else
            return 0;
    }
    public double getPerimeter(){ // chu vi
        return this.radius*2*PI;
    }
    public String toString(){
        if(filled){
            return "\nHình tròn màu "+ color +" bán kính " + String.valueOf(getRadius()) + "\nDiện tích là " + String.valueOf(getArea())
                    + "\nChu vi là " + String.valueOf(getPerimeter());
        }
        else
            return "\nĐường tròn màu "+ color +" có bán kính " + String.valueOf(getRadius())
                    + "\nChu vi là " + String.valueOf(getPerimeter());
    }
}