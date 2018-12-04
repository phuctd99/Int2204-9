package tuan12;

import java.util.ArrayList;

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
    public void findNotMarried(Person person){// tim nguoi chua ket hon
        if (!person.married) {
            System.out.println(person.name);
        }
        int n = person.children.size();
        for(int i = 0; i < n; i++){
            findNotMarried(person.children.get(i));
        }
    }

    public void findTwoChildren(Person person){//tim cap vo chong co 2 con
        int n = person.children.size();
        if (n == 2){
            System.out.println("cap vo chong co 2 con la:");
            System.out.println(person.name + " and " + person.spouse.name);
            for (int i = 0; i < n; i++){
                findTwoChildren(person.children.get(i));
            }
        }
    }

    public void findNewestGeneration(Person person){// tim the he moi nhat trong gia dinh
        if (person.generation == Person.youngestGeneration){
            System.out.println("the he moi nhat trong gia dinh la");
            System.out.println(person.name);
        }else{
            int n = person.children.size();
            for (int i = 0; i < n; i++){
                findNewestGeneration(person.children.get(i));
            }
        }
    }
}
public class Tuan12 {
    public static void main(String[] args) {
        Person a = new Person("Yasuo", "1/2/1943", true);
        a.Married(new Person("Shen", "7/2/1944", false));
        a.Baby(new Person("Urgot", "9/9/1975", true));
        a.spouse.Baby(new Person("Teemo", "2/12/1975", false));
        a.children.get(1).Married(new Person("Jax", "1/1/1978", true));
        a.children.get(1).Baby(new Person("Taric", "23/2/1998", false));
        a.children.get(1).Baby(new Person("Garen", "6/5/2002", true));
        FamilyManager fm = new FamilyManager();
        fm.findNotMarried(a);
        fm.findTwoChildren(a);
        fm.findNewestGeneration(a);
    }
}