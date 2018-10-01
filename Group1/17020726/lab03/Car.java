public class Car {
    private String seri;
    private double speed;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void brokenCar(double speed){
        this.speed -= speed;
    }

    public void Sound(){
        System.out.println("BRUM.... Brum......!");
    }

    public void goInTheFreeWay(int speed){
        this.speed += speed;
    }

}
