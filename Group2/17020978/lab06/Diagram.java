import java.util.ArrayList;

public class Diagram {

         Layer layer1 = new Layer();

        public void remove()
        {
                for(int i=0; i<layer1.layer.size(); i++)
                {
                    if(layer1.layer.get(i) instanceof Circle)
                    {
                        layer1.layer.remove(i);
                    }
                }
        }

}
