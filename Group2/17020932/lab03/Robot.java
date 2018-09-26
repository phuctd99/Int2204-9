package Object;

public class Robot {
    String name;
    String place;
    int type;
    String code;
    double time;
    public Robot(String name, String place, int type, String code, double time){
        this.name = name;
        this.place = place;
        this.type = type;
        this.code = code;
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void print(){
        System.out.println("name: "+ name);
        System.out.println("place: " + place);
        System.out.println("type: " + type);
        System.out.println("code: " + code);
        System.out.println("time: " + time);
    }

}
