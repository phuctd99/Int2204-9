/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

    public class Square extends Rectangle {
    public Square() {}

    public Square(ToaDo tren, ToaDo duoi) {
        super(tren, duoi);
    }
    public Square(String color, boolean filled, ToaDo tren, ToaDo duoi) {
        super(color, filled, tren, duoi);
    }
    public String toString(){
            return super.toString();
	}
}

