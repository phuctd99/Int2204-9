/**
 * Created by CCNE on 24/09/2018.
 */
public class Ruller {
    private String color;
    private int price;


    public Ruller (String color, int price){
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
