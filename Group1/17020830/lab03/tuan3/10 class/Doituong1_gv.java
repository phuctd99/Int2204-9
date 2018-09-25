public class Doituong_gv {

    private String name;
    private int tuoi ;
    private String chuyenmon;

    public void setName(String name){
        this.name = name;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public void setChuyenmon(String chuyenmon){
        this.chuyenmon = chuyenmon;
    }


    public String getName(){
        return name;
    }
    public int getTuoi(){
        return tuoi;
    }
    public String Chuyenmon(){
        return chuyenmon;
    }

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.tuoi);
        System.out.println(this.chuyenmon);
    }


}


