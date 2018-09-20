import java.util.*;
public class studentManagement {
    public student [] sv=new student[100];
    private int size=0;
    public boolean arrayStudent(student s)
    {
        if(size==100)
        {
            return false;
        }

        sv[size]=s;
        size++;
        return true;


    }

    public boolean sameGroup(student s1,student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }
    public void removeStudent(String id)
    {
        for(int i=0;i<size;i++)
        {
            if(sv[i].getId().equals(id))
            {
                sv[i]=sv[i+1];
                size--;

            }
        }
    }

    public void studentsByGroup()
    {
        List<String> clas = new ArrayList ();
        for (int i = 0; i < size; i++)
        {
            if (!clas.contains(sv[i].getGroup()))
            {
                clas.add(sv[i].getGroup());
            }
        }
        for (int i = 0; i < clas.size(); i++)
        {
            System.out.println("Group: " + clas.get(i));
            for (int j = 0; j < size; j++)
            {
                if ( sv[j].getGroup().equals(clas.get(i)))
                    System.out.println(sv[j].getInfo());
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        studentManagement sm=new studentManagement ();
        student s1=new student("lien"," 17020850","k62","uet@vnu.edu.vn");
        System.out.println(s1.getName());
        System.out.println(s1.getInfo());
        student s2=new student("an","001","k62","em");
        student s3=new student ("chi","002","k63","k63");
        student s4=new student("k64");
        if(sm.sameGroup(s1,s2))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        if(sm.sameGroup(s1,s3))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sm.arrayStudent(s1);
        sm.arrayStudent(s2);
        sm.arrayStudent(s3);
        //sm.removeStudent("001");
        sm.studentsByGroup();
        //System.out.println(sm.size);
    }
}
