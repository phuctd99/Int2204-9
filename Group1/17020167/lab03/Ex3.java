package ex3;
public class Ex3 {
    public static void main(String[] args) {
        Cat newCat = new Cat();
        newCat.setName("Antony");
        newCat.setAge(1);
        newCat.setBreed("male");
        System.out.println(newCat.getName());
        newCat.getInfor();
        newCat.caterwaul();
    }
    
}
