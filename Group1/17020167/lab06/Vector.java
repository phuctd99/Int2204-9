/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
public class Vector {

    public static double getVectorLenght(Point first, Point last) {
        return Math.sqrt((first.getX() - last.getX()) * (first.getX() - last.getX())
                + (first.getY() - last.getY()) * (first.getY() - last.getY()));
    }

    public static double getScalarProduct(Point oneFirst, Point oneLast,
            Point twoFirst, Point twoLast) {
        return (oneFirst.getX() - oneLast.getX()) * (twoFirst.getX() - twoLast.getX())
                + (oneFirst.getY() - oneLast.getY()) * (twoFirst.getY() - twoLast.getY());
    }

}
