package Object;

public class Dog {
    String name;
    String breed;
    int age;
    String color;
    public Dog(String name, int age, String breed, String color){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void print(){
        System.out.println("Name: "+ name);
        System.out.println("Breed: "+ breed);
        System.out.println("Age: "+ age);
        System.out.println("Color: "+ color);
    }
}
