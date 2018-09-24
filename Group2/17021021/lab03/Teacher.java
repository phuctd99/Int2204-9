public class Teacher {

    private String name;
    private String subject;
    private int experience;


    //constructor
    public Teacher() {
        name = "";
        subject = "";
        experience = 0;
    }

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }


    //getter
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }

    public String getInfo() {
        return name + " " + subject + " " + Integer.toString(experience);
    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}
