public class Main {
    public static void main(String[] args) {

        System.out.printf("Evaluation of Arithmetic expressions\n");
        ArithmeticExp exp = new Sum(
                new Number(3),
                new Product(new Number(2),new Number(5))
        );
        System.out.println("Result: " + exp.evaluate());

    }
}