package Lab06;

import java.util.ArrayList;


public class Diagram {
    public ArrayList<Layer> d = new ArrayList<Layer>();
    public void DeleteCircle(){
        for(int i=0; i<d.size(); i++){
            for(int j=0; j < d.get(i).sp.size(); j++){
                if(d.get(i).sp.get(j) instanceof Circle){
                    d.get(i).sp.remove(j);
                    j--;
                }
            }
        }
    }
}