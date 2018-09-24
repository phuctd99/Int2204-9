public class Dog {
    //Loài vật
    private String animal ;
    //Món ưa thích
    private String LikeFood ;
    //Sở thích
    private String hobby ;
    //Sở trường
    private String Forte ;
    //Khởi tạo
    public Dog() {
        animal = "Dog" ;
        LikeFood = "xương" ;
        hobby = "làm bạn với con người" ;
        Forte = " Trông nhà" ;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getLikeFood() {
        return LikeFood;
    }

    public void setLikeFood(String likeFood) {
        LikeFood = likeFood;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getForte() {
        return Forte;
    }

    public void setForte(String forte) {
        Forte = forte;
    }

    public String getInfo () {
        return ( animal + "\n" + LikeFood + "\n" + hobby + "\n" + Forte) ;
    }
}

