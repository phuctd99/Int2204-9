/**
 * Created by CCNE on 15/10/2018.
 */
abstract class Shape {
    protected int x = 0, y = 0;
    protected String color;

    public Shape(){
        this.color = "BLUE";
    }

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String out(){
        return ", Mau: " + color + ", Toa do: " + (char)(x+48) + ", " + (char)(y+48);
    }
}

//tọa độ là tọa độ góc trên bên trái
class rectangle extends Shape{
    protected int width = 1, height = 1;

    public rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public String out(){
        return "Hinh chu nhat, Chieu dai: "
                + (char)(height+48) + ", chieu rong: " + (char)(width+48)
                + super.out();
    }
}

//tọa độ là tọa độ góc trên bên trái
class square extends Shape{
    protected int side = 1;

    public square(int side){
        this.side = side;
    }

    public square(int x, int y, int side){
        super(x, y);
        this.side = side;
    }

    public String out(){
        return "Hinh vuong, Chieu dai canh: "
                + (char)(side+48) + super.out();
    }
}

//tọa độ là tọa độ tâm
class circle extends Shape{
    protected int radius = 1;

    public circle(int radius){
        this.radius = radius;
    }

    public circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    public String out(){
        return "Hinh tron, Ban kinh: "
                + (char)(radius+48) + super.out();
    }
}

//tọa độ là tọa độ trọng tâm
class triangle extends Shape{
    protected int a = 1, b = 1, c = 1;

    public triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public triangle(int x, int y, int a, int b, int c){
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String out(){
        return "Hinh tam giac, Chieu dai canh: "
                + (char)(a+48) + ", " + (char)(b+48) + ", " + (char)(c+48) + super.out();
    }
}


