public  class  Student{
    private  String name;
    private  String id;
    private  String group;
    private  String email;
    public  Student(){
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }
    public Student( String n, String sid, String em){
        name = n;
        id = sid;
        group = "K59CB";
        email = em;
    }
    public Student ( Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
    public void setName (String ten){
        name = ten;
    }

    public String getName() {
        return name;
    }

    public void setId(String masoSV) {
        id = masoSV;
    }
    public  String getId() {
        return id;
    }
    public void setGroup(String nhomlop){
        group = nhomlop;
    }

    public String getGroup(){

        return group;
    }

    public void setEmail(String gmail){
        email = gmail;
    }

    public String getEmail(){

        return email;
    }
    public void getInfo(){
        System.out.println("Ho ten: " + name);
        System.out.println("Ma SV: " + id);
        System.out.println("Lop: " + group);
        System.out.println("Email: " + email);
    }

}