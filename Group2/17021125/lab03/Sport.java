/**
 * Created by CCNE on 24/09/2018.
 */
public class Sport {
    private String football;
    private String volleyball;

    public Sport (String football, String volleyball){
        this.football= football;
        this.volleyball= volleyball;
    }

    public void setfootball (String name){
        this.football = football;
    }
    public String getfootball (){
        return this.football;
    }


    public void setvolleyball(String volleyball){
        this.volleyball = volleyball;
    }
    public String gevolleyball(){
        return this.volleyball;
    }
}
