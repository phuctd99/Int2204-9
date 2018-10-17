class Shape{
    String color;
    boolean filled;
    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        if(filled){
            return "\nHình dạng đầy, màu " + color ;
        }
        else
            return "Hình dạng viền màu " + color;
    }
}