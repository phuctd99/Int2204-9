public class Cat {
    private double age;
    private double height;
    private double mass;
    public Cat(){}

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    };

    public double getMass() {
        return mass;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void Scream(){
        System.out.println("Meo...moew...meo...");
    }

}
