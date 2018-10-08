public class Shape {

        protected String color;
        protected Boolean filled;


        public Shape() {
            this.color = "red";
            this.filled = true;
        }

        public Shape(String a, boolean b) { //kb tương tự
            this.color = a;
            this.filled = b;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Boolean getFilled() {
            return filled;
        }

        public void setFilled(Boolean filled) {
            this.filled = filled;
        }

        public boolean isFilled(){
            return filled;
        }

        @Override
        public String toString() {
            return "Shape{" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }
    }

