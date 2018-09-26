public class truonghoc {
    private String name;
    private String dc ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
    public void getInforth(){
        System.out.println(this.name);
        System.out.println(this.dc);
    }
}
