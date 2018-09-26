/**
 * Created by CCNE on 24/09/2018.
 */
public class Monkey {
    private int weigh;
    private int tall;

    public Monkey (int weigh, int tall){
        this.weigh = weigh;
        this.tall = tall;
    }

    public void setWeigh (int weigh){
        this.weigh =weigh;
    }
    public int getWeigh (){
        return this.weigh;
    }


    public void setTall (int tall){
        this.tall = tall;
    }
    public int getTall (){
        return this.tall;
    }
}
