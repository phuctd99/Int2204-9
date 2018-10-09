package fruit;

class Fruit {
    protected String name;
    protected String color;
    protected String shape;
    protected double weight;

    public Fruit(String name, String color, String shape, double weight) {
        this.name = name;
        this.color = color;
        this.shape = shape;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", weight=" + weight ;
    }
}
