public class Cho {
    private String name, breed, food;
    private int age;

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

    void setAge(int n){
        this.age = n;
    }
    int getAge() {
        return age;
    }

    void setFood (String n){ this.food = n;}
    String getFood (){return food;}

    // con Chó kêu Gâu Gâu
    void gau(){
        System.out.println("Gâu Gâu ..");
    }
    // In ra thông tin của Chó
    void getInfo(){
        System.out.println("Tên Chó là: " + getName());
        System.out.println("Giống Chó : " + getBreed());
        System.out.println("Chó :" + getAge() + " tuổi");
        System.out.println("Thức ăn :" +getFood());
    }
    public static void main(String[] args) {
        // Tạo thông tin về chó
        Cho c = new Cho();
        // Tên chó là Trung
        c.name = "Trung";
        // 3 tuổi
        c.age = 3;
        // Giống chó
        c.breed = "Samoyed";
        // Thức ăn
        c.food = "Cái gì cũng ăn ...";
        // In ra thông tin chó
        c.getInfo();
        // Chó sủa
        System.out.print("Chó sủa ");
        c.gau();


    }
}
