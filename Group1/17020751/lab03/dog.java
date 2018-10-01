public class dog {
    private String name, species, coatcolor, sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoatcolor() {
        return coatcolor;
    }

    public void setCoatcolor(String coatcolor) {
        this.coatcolor = coatcolor;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //ham khoi tao khong tham so
    public dog()
    {
        this.name = "lucky";
        this.coatcolor = "vang";
        this.sex = "duc";
        this.species = "ngao";

    }
}
