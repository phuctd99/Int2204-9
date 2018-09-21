public class student {
    private String name;
    private String id;
    private String group;
    private String emai;


    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(String i) {
        id = i;
    }

    public String getId() {
        return id;
    }

    public void setGroup(String gr) {
        group = gr;
    }

    public String getGroup() {
        return group;
    }

    public void setEmail(String em) {
        emai = em;
    }

    public String getEmail() {
        return emai;
    }

    public void getInfor() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(emai);
    }

    public student() {
        name = "Student";
        id = "000";
        group = "INT22041";
        emai = "uet@vnu.edu.vn";
    }

    public student (String n, String sid, String gr, String em){
        name = n;
        id = sid;
        group = gr;
        emai = em;
    }

    public student(student s){
        name = s.name;
        id = s.id;
        group = s.group;
        emai = s.emai;
    }
}
