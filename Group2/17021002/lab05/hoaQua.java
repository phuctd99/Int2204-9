package lapo5;

public class hoaQua {
	private int cost;
    private int weight;
    private String hsd;

    public int getcost() {
        return cost;
    }

    public void setcost(int cost) {
        this.cost = cost;
    }

    public int getweight() {
        return weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }

    public String gethsd() {
        return hsd;
    }

    public void sethsd(String hsd) {
        this.hsd = hsd;
    }

    public hoaQua(int cost, int weight, String hsd) {
        this.cost = cost;
        this.weight = weight;
        this.hsd = hsd;
    }

}
