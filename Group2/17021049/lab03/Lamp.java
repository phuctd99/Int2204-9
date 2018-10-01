import java.util.Scanner;

public class Lamp {
    private boolean turningOn, turningOff;
    private String enter;

    public Lamp(){
    }

    public void setTurningOn(boolean turningOn) {
        this.turningOn = turningOn;
    }

    public boolean getTurningOn() {
        return this.turningOn;
    }

    public void setTurningOff(boolean turningOff) {
        this.turningOff = turningOff;
    }

    public boolean getTurningOff() {
        return this.turningOff;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }

    public String getEnter() {
        return this.enter;
    }

    public void turnOnLamp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is Lamp turn on ? : ");
        this.setTurningOn(sc.nextBoolean());
        if (this.getTurningOn() == false) {
            System.out.println("Enter On to turn on : ");
            this.setEnter(sc.nextLine());
            if(this.getEnter() == "On") System.out.println("Lamp is turn on");
        } else {
            System.out.println("Lamp is turn on");
        }
    }

    public void turnOffLamp(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Is Lamp turn off ? : ");
            this.setTurningOff(sc.nextBoolean());
            if(this.getTurningOff()== false) {
                System.out.print("Enter Off to turn on : ");
                this.setEnter(sc.next());
                if(this.getEnter()== "Off")  System.out.println("Lamp is turn off");
            } else {
                System.out.println("Lamp is turn off");
            }
        }


    public static void main(String[] args){
        Lamp L = new Lamp();
        L.turnOnLamp();
        L.turnOffLamp();
    }
}