//public class BinaryExpression {
//    private static BinaryExpression ourInstance = new BinaryExpression();
//
//    public static BinaryExpression getInstance() {
//        return ourInstance;
//    }
//
//    private BinaryExpression() {
        public interface BinaryExpression extends Expression{
            Expression left();
            Expression right();
        }

//    }
//}
