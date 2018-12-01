import java.util.ArrayList;

class Person{
    static int youngestGen = 0;
    String name, dateOfBirth;
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

    public void MarriedTo(Person p){
        if (!married && !p.married) {
            this.spouse = p;
            if (!this.children.equals(p.children)){
                int n = p.children.size();
                for (int i = 0; i < n; i++){
                    this.children.add(p.children.get(i));
                }
            }
            p.children = this.children;
            p.spouse = this;
            p.married = true;
            this.married = true;
        }
    }

    public void bornBaby(Person baby){
        baby.generation = this.generation + 1;
        if (youngestGen < baby.generation) youngestGen = baby.generation;
        this.children.add(baby);
    }
}

class FamilyManager{
    public void findNotMarried(Person person){
        if (!person.married) {
            for(int j = 0; j < person.generation; j++){
                System.out.print("-");
            }
            System.out.println(person.name);
        }
        int n = person.children.size();
        for(int i = 0; i < n; i++){
            findNotMarried(person.children.get(i));
        }
    }

    public void findCoupleHas2Children(Person person){
        int n = person.children.size();
        if (n == 2){
            for(int j = 0; j < person.generation; j++){
                System.out.print("-");
            }
            System.out.println(person.name + " and " + person.spouse.name);
            for (int i = 0; i < n; i++){
                findCoupleHas2Children(person.children.get(i));
            }
        }
    }

    public void findNewestGeneration(Person person){
        if (person.generation == Person.youngestGen){
            for(int j = 0; j < person.generation; j++){
                System.out.print("-");
            }
            System.out.println(person.name);
        }else{
            int n = person.children.size();
            for (int i = 0; i < n; i++){
                findNewestGeneration(person.children.get(i));
            }
        }
    }
}

public class composite {
    public static void main(String[] args) {
        Person a = new Person("a", "1/2/3", true);
        a.MarriedTo(new Person("b", "1/2/4", false));
        a.bornBaby(new Person("c", "1/2/5", true));
        a.spouse.bornBaby(new Person("d", "2/2/5", false));
        a.children.get(1).MarriedTo(new Person("e", "1/1/5", true));
        a.children.get(1).bornBaby(new Person("f", "1/2/6", false));
        a.children.get(1).bornBaby(new Person("g", "2/2/6", true));
        FamilyManager fm = new FamilyManager();
        fm.findNotMarried(a);
        System.out.println("------------------------------");
        fm.findCoupleHas2Children(a);
        System.out.println("------------------------------");
        fm.findNewestGeneration(a);
    }
}
