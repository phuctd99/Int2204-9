abstract class BinaryExpression extends Expression {
    private Expression left(){
        return this.left();
    }

    private Expression right(){
        return this.right();
    }
}
