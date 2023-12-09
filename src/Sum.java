public class Sum extends Binary {

    public Sum(ArithmeticExp left, ArithmeticExp right){
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String toString() {
        return String.valueOf(left) + " + " + String.valueOf(right);
    }
}
