public class AirConditioner {

    private String producer;
    private boolean isOn;
    private int temperature;


    //constructor
    public AirConditioner() {
        producer = "";
        isOn = false;
        temperature = 16;
    }

    public AirConditioner(String producer, boolean isOn, int temperature) {
        this.producer = producer;
        this.isOn = isOn;
        this.temperature = temperature;
    }


    //getter
    public String getProducer() {
        return producer;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getInfo() {
        return producer + " " + (isOn ? "On " : "Off ") + Integer.toString(temperature);
    }


    //setter
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    //function
    public void turnOnOff() {
        isOn = !isOn;
    }

    public void increaseTemp() {
        temperature++;
    }

    public void decreaseTemp() {
        temperature--;
    }

}
