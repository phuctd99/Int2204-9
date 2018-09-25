package Object;

public class Cat {
    String name;
    int age;
    String breed;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print(){
        System.out.println("Name: "+ name);
        System.out.println("Breed: "+ breed);
        System.out.println("Age: "+ age);
        System.out.println("Color: "+ color);
    }

}
