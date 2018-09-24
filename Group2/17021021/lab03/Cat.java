public class Cat {

    private String name;
    private String action;
    private int age;

    //constructor
    public Cat() {
        name = "Cat";
        action = "sleep";
        age = 0;
    }

    public Cat(String name, String action, int age) {
        this.name = name;
        this.action = action;
        this.age = age;
    }

    public Cat(Cat other) {
        this.name = other.name;
        this.action = other.action;
        this.age = other.age;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return name + " " + action + " " + age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //function
    public void sleep() {
        action = "sleep";
    }

    public void eat() {
        action = "eat";
    }

    public void walk() {
        action = "walk";
    }

    public void catchMouse() {
        action = "catch mouse";
    }

    public void growUp() {
        age++;
    }

}
