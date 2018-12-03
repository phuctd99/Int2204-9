package Ex1;

import java.util.ArrayList;

class person {
    String name, birthDay;
    String sex;
    boolean married;
    ArrayList<person> children = new ArrayList<>();
    int genaration;
    static int youngestGenaration = 0;
    person other;

    public person(String name, String birthDay, String sex, boolean married) {
        this.name = name;
        this.birthDay = birthDay;
        this.sex = sex;
        this.married = married;
    }

    public void MarriedWith(person wife) {
        if (this.married == false && wife.married == false) {
            this.other = wife;
            wife.other = this;
            this.married = true;
            wife.married = true;
        }
    }

    public void bornChild(person newBaby) {
        if (this.married == true) {
            newBaby.genaration = this.genaration + 1;
            if (youngestGenaration < newBaby.genaration) youngestGenaration = newBaby.genaration;
            this.children.add(newBaby);
        }
    }

}