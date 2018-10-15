public class Shape{
    String color  ;
    boolean filled ;
    private boolean getPerimeter;
    public Shape(){
        color ="Red";
        filled = true ;
    }
    public Shape(String colors , boolean filled){
        this.color = colors ;
        this.filled = filled ;
    }
    public String getColor(){
        return color ;
    }
    public void setColor(String c){
        this.color = c ;
    }
    public boolean isFiller(){
        return this.filled ;
    }
    public void setFiller(boolean f){
        this.filled = f;
    }

    public String toString(){//ghi de phuong thuc toString()
        return color + " " + filled;
    }
}
