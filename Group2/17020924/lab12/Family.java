package Ex1;

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
        if (Person.genaration == person.youngestGenaration) {
            System.out.println(Person.name);
        } else {
            for (int i = 0; i < Person.children.size(); i++) {
                findYoungestGenaration(Person.children.get(i));
            }
        }
    }
}