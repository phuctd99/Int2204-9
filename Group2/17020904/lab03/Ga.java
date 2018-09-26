public class Ga {
    private String name, breed, food;
    private int egg;
    // getter và setter
    void setName(String n){
        this.name = n;
    }
    String getName() {
        return name;
    }

    void setBreed(String n){
        this.breed = n;
    }
    String getBreed() {
        return breed;
    }

    void setEgg(int n){
        this.egg = n;
    }
    int getEgg() {
        return egg;
    }

    void setFood (String n){ this.food = n;}
    String getFood (){return food;}
    // gà kêu
    void ga(){
        System.out.println("cục cục cục tác ");
    }
    // gà đẻ trứng
    void de(){}
    // mổ thóc

    void moThoc(){}
}
