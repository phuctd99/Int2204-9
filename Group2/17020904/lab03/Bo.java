public class Bo {
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

    // con Bò kêu
    void moo(){
        System.out.println("Moooooo ..");
    }
    // In ra thông tin của Bò
    void getInfo(){
        System.out.println("Tên Bò là: " + getName());
        System.out.println("Giống Bò : " + getBreed());
        System.out.println("Bò :" + getAge() + " tuổi");
        System.out.println("Thức ăn :" +getFood());
    }
    public static void main(String[] args) {
        // Tạo thông tin về chó
        Bo c = new Bo();

        c.name = "A";

        c.age = 3;

        c.breed = "sữa";

        c.food = "Cỏ";

        c.getInfo();

        System.out.print("Bò kêu ");
        c.moo();


    }
}
