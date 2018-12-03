public class bai1 {
    public void noMarry(Person person){
        for(Person o: person.getPersonList() ){
            if (!o.isMarriage()){
                System.out.println(o);
            }
            else noMarry(o);
        }
    }

    public void twoChild(Person person){
        if(person.getPersonList().size() == 2){
            System.out.println(person);
        }
        for(int i = 0; i < person.getPersonList().size(); i++){
            if((person.getPersonList().get(i)).getPersonList().size() != 2)
                twoChild(person.getPersonList().get(i));
        }
    }

//    public Person finalChild(Person person){
//        Person finalperson = person;
//        for(int i = 0; i < person.getPersonList().size(); i++){
//            if(person.getPersonList().size() == 0) {
//                finalperson = person;
//            }
//            else finalChild(person);
//        }
//        return finalperson;
//    }
    public static void main(String[] args) {
        Person Grandfather = new Person("Ông", "1/1/1930", "nam", true, "bà");

        Person father = new Person("Bố", "2/2/1960", "nam", true, "Mẹ");
        Person uncle1 = new Person("Chú1", "3/3/1965", "nam", true, "Dì1" );
        Person uncle2 = new Person("Chú2", "3/3/1970", "nam", true, "Dì2" );


        Grandfather.getPersonList().add(father);
        Grandfather.getPersonList().add(uncle1);
        Grandfather.getPersonList().add(uncle2);

        Person me = new Person("Tôi", "2/9/1999", "nam", false, "");
        Person brother = new Person("Anh", "2/2/1993", "nam", true, "Chị");
        Person uncle1son = new Person("Em trai họ", "3/3/2000", "nam", false, "");
        Person uncle1daughter = new Person("Em gái họ", "4/4/2003", "nữ", false, "");
        Person uncle2son = new Person("Em trai họ 2", "5/5/2003", "nam", false, "");

        uncle1.getPersonList().add(uncle1daughter);
        uncle1.getPersonList().add(uncle1son);

        uncle2.getPersonList().add(uncle2son);

        father.getPersonList().add(me);
        father.getPersonList().add(brother);

        Person brotherson = new Person("cháu", "1/1/2017", "nam", false, "");

        brother.getPersonList().add(brotherson);

        bai1 test = new bai1();
        test.noMarry(Grandfather);
        //test.twoChild(Grandfather);
//        for (int i = 0; i < test.finalChild(Grandfather).getPersonList().size();i++){
//            System.out.println(test.finalChild(Grandfather).getPersonList().get(i));
//        }

    }

}

