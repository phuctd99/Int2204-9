public class President {
    private String name, nhiemki, sinh, nghiquyet;
    private int age;

    void setName(String n){
        this.name = n;
    }
    String getName() {
        return name;
    }

    void setNK(String n){
        this.nhiemki = n;
    }
    String getBreed() {
        return nhiemki;
    }

    void setAge(int n){
        this.age = n;
    }
    int getAge() {
        return age;
    }

    void setSinh (String n){ this.sinh = n;}
    String getFood (){return sinh;}

    void setNghiquyet (String n){ this.nghiquyet = n;}
    String getNghiquyet (){return nghiquyet;}

    // ban hành nghị quyết

    void banHanhNghiQuyet(){
        System.out.println(getNghiquyet());
    }

    public static void main(String[] args) {
        President p = new President();
        p.name = "Donald Trump";
        p.sinh = "14 tháng 6, 1946 tại New York";
        p.age = 72;
        p.nghiquyet = "Rút khỏi Tpp";

        p.banHanhNghiQuyet();
    }

}
