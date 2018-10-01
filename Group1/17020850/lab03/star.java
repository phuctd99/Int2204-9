public class star {
    private String name;
    private String kind;


    //khoi tao gia tri
    public void setName(String name) {
        this.name = name;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    //tra ve gia tri
    public String getKind() {
        return kind;
    }
    public String getName() {
        return name;
    }
    //ham tinh cat-xe
    public int catxe(int fan,int cost)
    {
        int catxe=fan*cost;
        return catxe;
    }
}
