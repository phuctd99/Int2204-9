package ex1;

import java.util.Arrays;

public class PersonTestDrive {
    public static void main(String[] args) {
        Person james = new Person("James", new Date(1,1,1), "Male", true);
        Person hana = new Person("Hana", new Date(1,1,1), "FeMale", true);

        james.marry(hana);

        Person ryan = new Person("Ryan", new Date(1,1,1), "Male", false);
        Person kai = new Person("Kai", new Date(1,1,1), "Male", true);


        james.addChildren(ryan);
        james.addChildren(kai);

        Person jennifer = new Person("Jennifer", new Date(1,1,1), "FeMale", true);

        kai.marry(jennifer);

        Person son1 = new Person("Son1", new Date(1,1,1), "Male", true);
        Person son2 = new Person("Son2", new Date(1,1,1), "Male", true);
        Person son3 = new Person("Son3", new Date(1,1,1), "FeMale", true);
        Person son4 = new Person("Son4", new Date(1,1,1), "FeMale", true);


        kai.addChildren(son1);
        kai.addChildren(son2);
        kai.addChildren(son3);
        kai.addChildren(son4);

        ManagePerson managePerson = new ManagePerson();
        managePerson.findSingle(james);
        for (int i = 0; i < managePerson.getListSingle().size(); i ++) {
            System.out.println(managePerson.getListSingle().get(i).getName());
        }
        System.out.println("---------------------");
        managePerson.findFamilyHasTwoChildren(james);
        for (int i = 0; i < managePerson.getListTwoChildren().size(); i ++) {
            System.out.println(managePerson.getListTwoChildren().get(i).getName());
        }
        System.out.println("---------------------");
        managePerson.findNewGeneration(james);
        for (int i = 0; i < managePerson.getListNewGeneration().size(); i ++) {
            System.out.println(managePerson.getListNewGeneration().get(i).getName());
        }
    }
}
