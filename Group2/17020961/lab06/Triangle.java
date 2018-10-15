/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author CCNE
 */
public class Triangle extends Shape{
    private ToaDo td1;
    private ToaDo td2;
    private ToaDo td3;
    public Triangle() {}

    public Triangle(ToaDo td1, ToaDo td2, ToaDo td3) {
        super();
        this.td1 = td1;
        this.td2 = td2;
        this.td3 = td3;
    }

    public Triangle(String color, boolean filled, ToaDo p1, ToaDo p2, ToaDo p3) {
        super(color, filled);
        this.td1 = p1;
        this.td2 = p2;
        this.td3 = p3;
    }
    
    
}
