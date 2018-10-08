package test05;

public class main {
    public static void main(String args[]){
        Circle cc1 = new Circle();
        cc1.setRadius(5.0);
        cc1.setColor("blue");
        cc1.area(cc1);

        Rectangle r1 = new Rectangle();
        r1.setLength(6);
        r1.setWidth(5);
        r1.setColor("green");
        r1.cvdt(r1);

        Square s1 = new Square();
        s1.setColor("black");
        s1.setSide(11);
        s1.setWidth(s1.getSide());
        s1.setLength(s1.getSide());
        s1.cvdt(s1);

        System.out.println("hình tròn: " + cc1.toString());
        System.out.println("hình chữ nhật: " + r1.toString());
        System.out.println("hình vuông: " + s1.toString());
    }
}
