import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String birthday;
    private String sex;
    private boolean marriage;
    private String wife;
    private List<Person> personList;

    public Person(String name, String birthday, String sex, boolean marriage, String wife){
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.marriage = marriage;
        this.wife = wife;
        personList = new ArrayList<>();
    }

    public void addPerson(Person p){
        personList.add(p);
    }

    public List<Person> getPersonList(){
        return personList;
    }

    public String getWife() {
        return wife;
    }
    public boolean isMarriage(){
        return marriage;
    }

    @Override
    public String toString() {
        return "Person: " + "name = " + name + ", birthday = " + birthday + ", sex = " + sex + ", marriage: " + marriage + ", namePartner = " + wife;
    }
}