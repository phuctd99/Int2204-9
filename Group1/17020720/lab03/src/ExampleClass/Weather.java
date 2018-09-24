package ExampleClass;

public class Weather {
    private String address, time, temperature, rain, humidity, wind;

    public Weather(String address, String time, String temperature, String rain, String humidity, String wind) {
        this.address = address;
        this.time = time;
        this.temperature = temperature;
        this.rain = rain;
        this.humidity = humidity;
        this.wind = wind;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public void getInfo(){
        System.out.println("Du bao thoi tiet !!!");
        System.out.println(address);
        System.out.println(time);
        System.out.println("Nhiet do trung binh: " + temperature);
        System.out.println("Kha nang co mua: " + rain);
        System.out.println("Do am: " + humidity);
        System.out.println("Gio: " + wind);
    }
    public static void main(String[] args){
        Weather w = new Weather("Ha Noi", "Thu hai, ngay 24/9/2018", "30", "50%", "65%", "5 km/h");
        w.getInfo();
    }
}
