package Ex1;

public class Main {
	public static void main(String[] args) {
        person gen1 = new person("Ronaldo", "1/1/1988","Male", false);
        gen1.MarriedWith(new person("Messi", "1/1/1998", "Female", false));
        gen1.bornChild(new person("Neymar", "1/1/2002", "Female", false));
        gen1.bornChild(new person("Suarez", "31/1/2005", "Male", false));
        gen1.children.get(0).MarriedWith(new person("De Bruyne","24/5/2004", "Male", false));
        gen1.children.get(0).bornChild(new person("Sterling", "25/6/2010", "Male", false));
        gen1.children.get(0).bornChild(new person("Sane", "29/9/2016", "Male", false));
        Family family = new Family();
        family.findPersonNotMarried(gen1);
        family.findPersonBorm2Child(gen1);
        System.out.println("---------------");
        family.findYoungestGenaration(gen1);
    }
}
