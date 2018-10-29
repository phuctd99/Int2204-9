/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08;

/**
 *
 * @author Hoang Vu Huong
 */
public class Multiplication extends BinaryExpression{
    Expression left, right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        String a;
        if(left instanceof Square ||
           left instanceof Multiplication ||
           left instanceof Numeral ||
           left instanceof Division){
            a = left.toString() + "*";
        }
        else{
            a = "(" + left.toString() + ") *";
        }
        if(right instanceof Square ||
           right instanceof Multiplication ||
           right instanceof Numeral ||
           right instanceof Division){
            a = a+ right.toString();
        }
        else{
            a += "(" + right.toString()+ ")";
        }
        return a;
    }

    @Override
    public int evaluate() {
        return left.evaluate()* right.evaluate();
    }
}
