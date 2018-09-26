public class Pen {
    private String color;
    private int price;

    public Pen (String color, int price){
        this.color = color;
        this.price = price;
    }

    public void setColor (String color){

        this.color = color;
    }
    public String getColor (){

        return this.color;
    }


    public void setPrice (int price){
        this.price = price;
    }
    public int getPrice (){

        return this.price;
    }
}
