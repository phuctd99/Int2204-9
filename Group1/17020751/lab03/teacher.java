public class teacher {

        private String name , age, monday;
//get/set tuoi
        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
//get/set ten
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
//get/set mon day
        public String getMonday() {
            return monday;
        }

        public void setMonday(String monday) {
            this.monday = monday;
        }
        // ham khoi tao co tham so
        public teacher(String name, String age, String monday)
        {
            this.age = age;
            this.monday = monday;
            this.name = name;
        }
        public static void main( String[] args)
        {
        }
}
