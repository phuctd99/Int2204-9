public class cau2 {
    /*
    - Trong biểu đồ có tất cả ... quan hệ thừa kế (is-a)
      Circle là hình tròn thì không thể kế thừa hình chữ nhật được,
    còn Shape là hình dạng bất kỳ, nên Circle có thể kế thừa được.

     */
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());

        Circle circle = new Circle();
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());

        Square square = new Square();
        System.out.println(square.toString());
    }
}
