public class Expression {
abstract class expression{
    public abstract String toString();
    public abstract int evaluate();
}

class numeral extends expression{
    int value;
    public numeral(int value){
       this.value = value;
    }

    public numeral(){
        this.value = 0;
    }

    @Override
    public String toString() {
        return ""+value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}

class square extends expression{
    expression ex;
    public square(expression ex){
        this.ex = ex;
    }

    @Override
    public String toString() {
        return ex.evaluate()+"^2 = ";
    }

    @Override
    public int evaluate() {
        return ex.evaluate()*ex.evaluate();
    }
}


class addition extends expression{
    expression left, right;

    public addition(expression left, expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.evaluate() + " + " + right.evaluate();
    }

    @Override
    public int evaluate() {
        return left.evaluate()+right.evaluate();
    }
}

class subtraction extends expression{
    expression left, right;

    public subtraction(expression left, expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.evaluate() + " - " + right.evaluate();
    }

    @Override
    public int evaluate() {
        return left.evaluate()-right.evaluate();
    }
}

class multiplication extends expression{
    expression left, right;

    public multiplication(expression left, expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.evaluate() + " * " + right.evaluate();
    }

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();
    }
}

    class division extends expression{
        expression left, right;

        public division(expression left, expression right){
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return left.evaluate() + "/" + right.evaluate();
        }

        @Override
        public int evaluate() {
            return left.evaluate()/right.evaluate();
        }
    }

    public static void main(String[] args) {
        Expression ex = new Expression();
        expression e = ex.new square(ex.new addition(ex.new subtraction(ex.new square(ex.new numeral(10)), ex.new numeral(1)), ex.new multiplication(ex.new numeral(2), ex.new numeral(3))));
        System.out.println(e.evaluate());
        try {
            division div = ex.new division(ex.new numeral(3), ex.new numeral(0));
            System.out.println(div.evaluate());
        }catch (ArithmeticException ect){
            System.out.println("loi chia cho so 0");
        }
    }
}
