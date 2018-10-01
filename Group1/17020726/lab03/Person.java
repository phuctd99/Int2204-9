public class Person {
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }
    public boolean isAdult(){
        if(this.age >= 18) return true;
        else return false;
    }

    public void sayLoveYou(){
        System.out.println("I love You");
    }

}
