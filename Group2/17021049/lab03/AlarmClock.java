import java.util.Scanner;

public class AlarmClock {
    private int hour, minute, second;

    //Ham khoi tao AlarmClock

    public AlarmClock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void alarmTimer(){
        if(this.getHour()== 6 && this.getMinute()== 0 && this.getSecond() == 0){
            System.out.println("Ring...ring : You have to wake up");
        }
        else if(this.getHour()== 6 && this.getMinute()== 45 && this.getSecond() == 0) {
            System.out.println("Ring...ring : You have to go to school");
        }
        else if(this.getHour()== 19 && this.getMinute()== 30 && this.getSecond() == 0) {
            System.out.println("Ring...ring : You have to study");
        }
        else if(this.getHour()== 23 && this.getMinute()== 0 && this.getSecond() == 0) {
            System.out.println("Ring...ring : You have to go to bed");
        }
        else {
            System.out.println(" ");
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Time : "); //Hien thi thoi gian
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        AlarmClock a = new AlarmClock(h,m,s);
        a.alarmTimer(); //Thoi gian bao thuc
    }

}
