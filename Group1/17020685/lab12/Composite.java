/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan_12;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
class Person{
    static int youngestGeneration = 0;
    String name;
    String dateOfBirth;
    boolean sex; //true = male, false = female
    boolean married = false;
    int generation;
    Person spouse = null;
    ArrayList<Person> children = new ArrayList<>();

    public Person(String name, String dateOfBirth, boolean sex){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.generation = 0;
    }

    public void Married(Person p){
        if (!married && !p.married) {
            this.spouse = p;
            int n = p.children.size();
            for (int i = 0; i < n; i++){
                this.children.add(p.children.get(i));
            }
            
            p.children = this.children;
            p.spouse = this;
            p.married = true;
            this.married = true;
        }
    }

    public void Baby(Person baby){
        baby.generation = this.generation + 1;
        if (youngestGeneration < baby.generation) youngestGeneration = baby.generation;
        this.children.add(baby);
    }
}

class FamilyManager{
    public void findNotMarried(Person person){
        if (!person.married) {
            System.out.println(person.name);
        }
        int n = person.children.size();
        for(int i = 0; i < n; i++){
            findNotMarried(person.children.get(i));
        }
    }

    public void findTwoChildren(Person person){
        int n = person.children.size();
        if (n == 2){
            System.out.println(person.name + " and " + person.spouse.name);
            for (int i = 0; i < n; i++){
                findTwoChildren(person.children.get(i));
            }
        }
    }

    public void findNewestGeneration(Person person){
        if (person.generation == Person.youngestGeneration){
            System.out.println(person.name);
        }else{
            int n = person.children.size();
            for (int i = 0; i < n; i++){
                findNewestGeneration(person.children.get(i));
            }
        }
    }
}
public class Composite {
    public static void main(String[] args) {
        Person a = new Person("a", "1/2/3", true);
        a.Married(new Person("b", "1/2/4", false));
        a.Baby(new Person("c", "1/2/5", true));
        a.spouse.Baby(new Person("d", "2/2/5", false));
        a.children.get(1).Married(new Person("e", "1/1/5", true));
        a.children.get(1).Baby(new Person("f", "1/2/6", false));
        a.children.get(1).Baby(new Person("g", "2/2/6", true));
        FamilyManager fm = new FamilyManager();
        fm.findNotMarried(a);
        System.out.println("------------------------------");
        fm.findTwoChildren(a);
        System.out.println("------------------------------");
        fm.findNewestGeneration(a);
    }
}

