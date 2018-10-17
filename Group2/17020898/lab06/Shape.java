public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;
    private boolean isMove;
    public Shape(){
        x = 0;
        y = 0;
        color = "";
        isMove = true;
    }

    public Shape(int x, int y, String color, boolean isMove) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.isMove = isMove;
    }
    public int moveRightX(){
        return x++;
    }
    public int mowveLeftX(){
        return x--;
    }
    public int moveUpY(){
        return y++;
    }
    public int moveDownY(){
        return y--;
    }
}
