/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

public class Square extends Rectangle {
    
    public Square() {}
    
 
    public Square(ToaDo dinhGocTren, ToaDo dinhGocDuoi) {
        super(dinhGocTren, dinhGocDuoi);
    }

    public Square(String color, boolean filled, ToaDo dinhGocTren, ToaDo dinhGocDuoi) {
        super(color, filled, dinhGocTren, dinhGocDuoi);
    }
}
