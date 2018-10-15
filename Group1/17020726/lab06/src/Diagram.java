import java.util.ArrayList;

public class Diagram
{
    ArrayList<Layer> diag = new ArrayList<Layer>();

    public ArrayList<Layer> remoCircle(ArrayList<Layer> diag)
    {
        for (int i = 0; i < diag.size(); i++)
        {
            diag.get(i).removeCircle();
        }
        return diag;
    }
}
