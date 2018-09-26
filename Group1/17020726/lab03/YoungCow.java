public class YoungCow {
    private double age;
    private double height;
    private double mass;
    public YoungCow(){}

    public void setAge(double age) {
        if(age < 1) this.age = age;
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
        if(height < 1.2) this.height = height;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void Moo(){
        System.out.println("Mooo...Mooo!");
    }

    public void eatGrass(double grass){
        this.mass += grass/20;
    }

}
