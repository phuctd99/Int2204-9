public class Coder {

    private String name;
    private int age;
    private int projectAttempt;
    private int salary;


    //constructor
    public Coder() {
        name = "Name";
        age = -1;
        projectAttempt = -1;
        salary = -1;
    }

    public Coder(String name, int age, int projectAttempt, int salary) {
        this.name = name;
        this.age = age;
        this.projectAttempt = projectAttempt;
        this.salary = salary;
    }


    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getProjectAttempt() {
        return projectAttempt;
    }

    public int getSalary() {
        return salary;
    }

    public String getInfo() {
        return name + " " + age + " " + projectAttempt + " " + salary;
    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProjectAttempt(int projectAttempt) {
        this.projectAttempt = projectAttempt;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    //function
    public void older() {
        age++;
    }

    public void salaryIncrease(int money) {
        salary += money;
    }

    public void projectFinished() {
        if (projectAttempt > 0)
            projectAttempt--;
    }

}
