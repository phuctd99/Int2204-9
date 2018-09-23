public class Meo {
    private String name, breed;
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

    // con Mèo kêu Meo Meo
    void meo(){
        System.out.println("Meo Meo ..");
    }
    void getInfo(){
        System.out.println("Tên Mèo là: " + getName());
        System.out.println("Giống Mèo : " + getBreed());
        System.out.println("Lợn :" + getAge() + " tuổi");
    }
    public static void main(String[] args) {
        // Tạo thông tin về mèo
        Meo m = new Meo();
        // Tên mèo là Lợn
        m.name = "Lợn";
        // 2 tuổi
        m.age = 2;
        // Giống mèo
        m.breed = "Anh";
        // In ra thông tin mèo
        m.getInfo();
        // Mèo kêu meo
        m.meo();


    }
}
