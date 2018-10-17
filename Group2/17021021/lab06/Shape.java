public class Shape {
    protected int posiX;
    protected int posiY;
    protected String color;

    //constructor
    public Shape() {
        posiX = 0;
        posiY = 0;
        color = "";
    }

    public Shape(int x, int y, String color) {
        posiX = x;
        posiY = y;
        this.color = color;
    }

    //function
    public void moveTo(int x, int y) {
        posiY = y;
        posiX = x;
    }
}
