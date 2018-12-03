package cau1;

import java.util.*;
/*
* – Component (DrawingElement):

     + khai báo interface cho các đối tượng trong thành phần.

     + thực thi hành vi mặc định cho interface chung cho tất cả các lớp tương ứng.

     + khai báo một interface để truy xuất và quản lý các thành phần con của nó.

     + (tùy chọn) định nghĩa một interface để truy xuất một thành phần cha của thành phần hiện tại trong cấu trúc đệ quy
 và thực thi nó nếu thích hợp.
     */
interface Component {
    public String defaultMethod();
    public ArrayList<Component> getChildren();
    public boolean addComponent(Component c);
    public boolean removeComponent(Component c);
}
/*
-  Composite (CompositeElement):

     + định nghĩa hành vi cho các thành phần có phần con.

     + lưu trữ các thành phần con.

     + thực thi các hoạt động liên qua đến phần con trong Component interface
 */
class Composite implements Component {
    private String name;
    private String birthday;
    private String sex;
    private boolean maritalStatus;
    private ArrayList<Component> components = new ArrayList<Component>();

    public Composite(String name ,String birthday, String sex, boolean maritalStatus)         {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
    }

    public String defaultMethod() {
        String s = " (" + this.name + ":";
        for (Component child: getChildren())
            s += " " + child.defaultMethod();
        return s + ") ";
    }

    public ArrayList<Component> getChildren()       { return components; }
    public boolean addComponent(Component c)        { return components.add(c); }
    public boolean removeComponent(Component c)     { return components.remove(c); }
}
/*
– Leaf (PrimitiveElement):

     + mô tả các đối tượng “lá” trong thành phần. Một “lá” không có lá con.

     + định nghĩa hành vi cho các đối tượng nguyên thủy trong thành phần.
 */
class Leaf implements Component {

    private String name;
    private String birthday;
    private String sex;
    private boolean maritalStatus;

    public Leaf(String name, String birthday, String sex)              {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.maritalStatus = false;
    }

    public String defaultMethod()                   { return this.name; }
    public ArrayList<Component> getChildren()       { return null; }
    public boolean addComponent(Component c)        { return false; }
    public boolean removeComponent(Component c)     { return false; }
}

class CompositePattern {
    public static void main(String[] args) {
        Composite father = new Composite("Bod","01/01/1960","Male",true);
        Leaf sister = new Leaf("sister", "10/10/1996", "Female");
        Leaf baby = new Leaf("baby","11/11/2001","Male");
        father.addComponent(sister);
        father.addComponent(baby);

        Composite aunt = new Composite("Lisa","00/00/0000","Male", true);
        aunt.addComponent(new Leaf("Pipi", "11/11/1111","Female"));

        Composite grandmother = new Composite("Tyfali","01/10/1930","Female",true);
        grandmother.addComponent(father);
        grandmother.addComponent(aunt);

        System.out.println(grandmother.defaultMethod());
    }
}