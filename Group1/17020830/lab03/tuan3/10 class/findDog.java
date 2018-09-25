public class findDog{
    private String name;
    private int tuoi;
    private String breed;

    public void setName(String name){
        this.name = name;
    }
    public void setTuoi(tuoi){
        this.tuoi = tuoi;
    }
    public void setBreed(String br) {
        this.breed = br;
    }
    public String getName(){
        return name;
    }
    public int getTuoi(){
        return tuoi;
    }
    public String Chuyenmon(){
        return breed;
    }


    public void getInfogv(){
        System.out.println(this.name);
        System.out.println(this.tuoi);
        System.out.println(this.breed);

    }

}
