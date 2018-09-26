import javax.swing.tree.FixedHeightLayoutCache;

public class Bed {

    private int length;
    private int width;
    private int height;
    private String material;


    //constructor
    public Bed() {
        length = 0;
        width = 0;
        height = 0;
        material = "wood";
    }

    public Bed(int length, int width, int height, String material) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }


    //getter
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public String getInfo() {
        return Integer.toString(length) + " "
                + Integer.toString(width) + " "
                + Integer.toString(height) + " "
                + material;
    }


    //setter
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
