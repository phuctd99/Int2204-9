package lab7;

public class Square extends Rectangle {


        public Square() {}

        public Square(Point top_left, Point bot_right) {
            super(top_left, bot_right);
        }

        public Square(Point top_left, Point bot_right, String color, boolean filled) {
            super(top_left, bot_right, color, filled);
        }


}
