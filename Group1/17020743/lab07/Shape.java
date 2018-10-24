/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.awt.Component;

/**
 *
 * @author Liscli
 */
abstract class Shape extends Component{
    // trả về màu của hình
    abstract String getColor();
    //cài màu của hình
    abstract void setColor(String color);
    //trả về có đầy hay không 
    abstract boolean isFilled();
    //cài trạng thái đày hay không đầy
    abstract void setFilled(boolean filled);

}