public class Rectangle extends Shape {

    private Double width = 1.0;

    private Double length = 1.0;

    public Rectangle(){
    }

    public Rectangle(Double width, Double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(Double width, Double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.setColor(color);
        this.setFilled(filled);
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getArea(){
        return this.width * this.length;
    }

    public Double getPerimeter() {
        return (this.width + this.length) * 2;
    }
    public String toString(){
        return this.getWidth() + " " + this.getLength() + "\n" + this.getPerimeter() + "\n" + this.getArea();
    }

    public static void main(String[] args) {
        Rectangle h1 = new Rectangle(2.0, 1.0);
        System.out.println(h1.toString());
    }
}
