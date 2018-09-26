public class Laptop {
    private String name;
    private int cost;
    private String chip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public boolean isHighTachChip(){
        if(this.chip.equals("I5") || this.chip.equals("I7")) return true;
        else return false;
    }

    public void  getInfor(){
        System.out.println("Ten may: "+this.name+"| Ten chip: "+this.chip+"| Gia: "+this.cost);
    }

}
