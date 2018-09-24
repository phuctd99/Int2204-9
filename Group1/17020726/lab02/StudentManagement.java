import java.util.ArrayList;

public class StudentManagement
{

    public boolean sameGroup(Student std1, Student std2)
    {
        return (std1.getGroup() == std2.getGroup());
    }

    ArrayList <Student> stdList = new ArrayList<Student>();

    void studentsByGroup()
    {
        ArrayList<String> totalGroup = new ArrayList<String>();
        String searchGroup;
        int i = 0;
        int size = stdList.size();
        do
        {
            searchGroup = stdList.get(i).getGroup();

            if ( totalGroup.contains(searchGroup) )
            {
                i++;
                continue;
            }

            for (Student std: stdList)
            {
                if (std.getGroup() == searchGroup)
                {
                    std.getInfo();
                }
            }
            totalGroup.add(searchGroup);
            i++;
        }while (i < size);


    }

    void removeStudent(String id)
    {
        for (Student std: stdList)
        {
            if (std.getID().equalsIgnoreCase(id))
            {
                stdList.remove(std);
            }
        }
    }
    public static void main(String[] args)
    {

        System.out.println(str1 == str2);
    }
}