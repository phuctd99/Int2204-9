public class GirlFriend {
    //Tên
    private String name ;
    //Tuổi
    private  int Age ;
    //Chiều cao
    private int height ;
    //Món ưa thích
    private String LikeFood ;

    public GirlFriend() {
        name = "Trang" ;
        Age = 19 ;
        height = 154 ;
        LikeFood = "MilkTea" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLikeFood() {
        return LikeFood;
    }

    public void setLikeFood(String likeFood) {
        LikeFood = likeFood;
    }
    public String GetInfo () {
        return (name + "\n" + Age + "\n" + height + "\n" + LikeFood) ;
    }
}
