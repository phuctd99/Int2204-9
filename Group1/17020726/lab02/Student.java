class Student
{
    private String name, id, group, email;

    Student()
    {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    Student(String sname, String sid, String em)
    {
        name = sname;
        id = sid;
        email = em;
        group = "INT22041";
    }

    Student(Student s)
    {
        name  = s.getName();
        id = s.getID();
        email = s.getEmail();
        group = s.getGroup();
    }


    public String getName()
    {
        return this.name;
    }

    public void setName(String nameToChange)
    {
        name = nameToChange;
    }

    public String getID()
    {
        return this.id;
    }

    public void setID(String idToChange)
    {
        id = idToChange;
    }

    public String getGroup()
    {
        return this.group;
    }

    public void setGroup(String groupToChange)
    {
        group = groupToChange;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String emailToChange)
    {
        email = emailToChange;
    }

    void getInfo()
    {
        System.out.println(name + "\t" + id + "\t" + group + "\t" + email);
    }
}