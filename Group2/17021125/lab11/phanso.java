/**
 * Created by CCNE on 19/11/2018.
 */
public class phanso implements Comparable<phanso>{
    protected int ts, ms;
    public phanso(int x, int y){
        ts = x;
        ms = y;
    }

    @Override
    public int compareTo(phanso ps) {
        if (ts*ps.ms < ps.ts*ms) return -1;
        if (ts*ps.ms > ps.ts*ms) return 1;
        return 0;
    }
}
