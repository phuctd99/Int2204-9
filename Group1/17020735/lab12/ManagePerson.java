package ex1;

import java.util.ArrayList;

public class ManagePerson {

    private ArrayList<Person> listSingle = new ArrayList<>();
    private ArrayList<Person> listTwoChildren = new ArrayList<>();
    private ArrayList<Person> listNewGeneration = new ArrayList<>();

    public void findSingle(Person person) {

        if (person.getListChildren() != null) {
            for (int i = 0; i < person.getListChildren().size(); i++) {
                findSingle(person.getListChildren().get(i));
            }
        }

        if (!person.isMarried()) {
            this.listSingle.add(person);
        }
    }

    public void findFamilyHasTwoChildren(Person person) {
        if (person.getListChildren().size() == 2) {
            listTwoChildren.add(person);
        }
        for (int i = 0; i < person.getListChildren().size(); i++) {
            findFamilyHasTwoChildren(person.getListChildren().get(i));
        }

    }

    public void findNewGeneration(Person person) {

        for (int i = 0; i < person.getListChildren().size(); i++) {

            findNewGeneration(person.getListChildren().get(i));
        }
        if (person.getGeneration() == Person.generationHeight) {
            listNewGeneration.add(person);
        }
    }

    public ArrayList<Person> getListSingle() {
        return listSingle;
    }

    public ArrayList<Person> getListTwoChildren() {
        return listTwoChildren;
    }

    public ArrayList<Person> getListNewGeneration() {
        return listNewGeneration;
    }
}
