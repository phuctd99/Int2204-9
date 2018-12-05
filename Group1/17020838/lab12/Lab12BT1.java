package lab12bt1;

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

    class Family {
        public void findPersonNotMarried(person Person) {
            if (Person.married == false) {
                System.out.println(Person.name + "\t" + Person.birthDay + "\t" + Person.sex);
            }

            int numchild = Person.children.size();
            for (int i = 0; i < numchild; i++) {
                findPersonNotMarried(Person.children.get(i));
            }
        }

        public void findPersonBorm2Child(person Person) {
           if (Person.children.size() == 2) {
               System.out.println(Person.name + "\t" + Person.other.name);
           }

           for (int i = 0; i < Person.children.size(); i++) {
               findPersonBorm2Child(Person.children.get(i));
           }
        }

        public void findYoungestGenaration(person Person) {
            if (Person.genaration == Person.youngestGenaration) {
                System.out.println(Person.name);
            } else {
                for (int i = 0; i < Person.children.size(); i++) {
                    findYoungestGenaration(Person.children.get(i));
                }
            }
        }
    }
public class Lab12BT1 {

    public static void main(String[] args) {
        person gen1 = new person("Bob", "1/1/1988","Male", false);
            gen1.MarriedWith(new person("Ana", "1/1/1998", "Female", false));
            gen1.bornChild(new person("Jennie", "1/1/2002", "Female", false));
            gen1.bornChild(new person("Ryan", "31/1/2005", "Male", false));
            gen1.children.get(0).MarriedWith(new person("Smeb","24/5/2004", "Male", false));
            gen1.children.get(0).bornChild(new person("Deft", "25/6/2010", "Male", false));
            gen1.children.get(0).bornChild(new person("Mata", "29/9/2016", "Male", false));
            Family family = new Family();
            family.findPersonNotMarried(gen1);
            family.findPersonBorm2Child(gen1);
            System.out.println("Thế hệ mới nhất trong phả hệ:");
            family.findYoungestGenaration(gen1);
    }

}
