package fruit;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("apple", "green", "circle", 0.5);
        orange orange = new orange("cao phong", "orange", "circle", 0.5, "Viet Nam", 1);
        CaoPhongOrange orange1 = new CaoPhongOrange("cao phong", "orange", "circle", 0.5, "Viet Nam",
                                                    1, 15000, "05/02/2018", 100);
        SanhOrange orange2 = new SanhOrange("sanh", "green", "circle", 0.7, "Viet Nam",
                                                1, 30000, "04/09/2018", 100);
        apple apple = new apple("apple", "red", "circle", 0.5, "American", 1);
        System.out.println(fruit.toString());
        System.out.println(apple.toString());
        System.out.println(orange.toString());
        System.out.println(orange1.toString());
        System.out.println(orange2.toString());

    }
}
