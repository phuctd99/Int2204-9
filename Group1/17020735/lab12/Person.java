package ex1;

import java.util.ArrayList;

public class Person {
    private String name;
    public Date date;
    private String sex;
    private boolean married;
    private ArrayList<Person> listChildren = new ArrayList<>();
    private Person couple;
    private int generation = 0;
    public static int generationHeight = 0;

    public Person(String name, Date date, String sex, boolean married) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.married = married;
    }

    public void addChildren(Person children) {
        children.setGeneration(this.generation + 1);
        if (generationHeight < children.getGeneration()) {
            generationHeight = children.getGeneration();
        }

        this.listChildren.add(children);
        if (couple != null && couple.listChildren.contains(children) == false) {
            couple.addChildren(children);
        }


    }

    public void marry(Person person) {
        couple = person;
        couple.setGeneration(this.generation);
        if (couple.getCouple() == null)
            couple.marry(this);
//        System.out.println(this.getName());
//        System.out.println(this.generation);
    }

    public Person getCouple() {
        return couple;
    }

    public ArrayList<Person> getListChildren() {
        return listChildren;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setListChildren(ArrayList<Person> listChildren) {
        this.listChildren = listChildren;
    }

    public void setCouple(Person couple) {
        this.couple = couple;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getName() {
        return name;
    }
}
