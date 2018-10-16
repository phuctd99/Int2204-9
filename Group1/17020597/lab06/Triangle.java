/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.lab6;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape {
    private ToaDo edge1;
    private ToaDo edge2;
    private ToaDo edge3;

    public void setEdge1(ToaDo edge1) {
        this.edge1 = edge1;
    }

    public void setEdge2(ToaDo edge2) {
        this.edge2 = edge2;
    }

    public void setEdge3(ToaDo edge3) {
        this.edge3 = edge3;
    }

    public ToaDo getEdge1() {
        return edge1;
    }

    public ToaDo getEdge2() {
        return edge2;
    }

    public ToaDo getEdge3() {
        return edge3;
    }
    public Triangle() {
        super("", true);
        this.edge1.setX0(0);
        this.edge1.setY0(0);
        this.edge2.setX0(1);
        this.edge2.setY0(0);
        this.edge3.setX0(0);
        this.edge3.setY0(1);
    }

    public Triangle(ToaDo edge1, ToaDo edge2, ToaDo edge3, String color, boolean filled) {
        super(color, filled);
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }
   public boolean isTamGiac()
   {
       if(this.edge1.equals(this.edge2)) return false;
       if(this.edge1.equals(this.edge3)) return false;
       if(this.edge2.equals(this.edge3)) return false;
       ToaDo vts = new ToaDo();
       vts = vts.Linear(edge1, edge2);
       if(edge3.getY0() != edge3.getX0()*vts.getX0() + vts.getY0()) return true;
       return false;
   }
    @Override
    public String getNameShape() {
        return "Hình tam giác";
    }
    
}
