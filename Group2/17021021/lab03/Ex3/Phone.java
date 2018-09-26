public class Phone {

    private String name;
    private String producer;
    private String color;


    //constructor
    public Phone() {
        name = "";
        producer = "";
        color = "";
    }

    public Phone(String name, String producer, String color) {
        this.name = name;
        this.producer = producer;
        this.color = color;
    }


    //getter
    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    public String getInfo() {
        return name + " " + producer + " " + color;
    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
