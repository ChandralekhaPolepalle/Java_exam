public class Main {
    public static void main(String[] args) {

        System.out.printf("Evaluation of Arithmetic expressions\n");
        ArithmeticExp exp = new Sum(
                new Number(3),
                new Product(new Number(2),new Number(5))
        );
        ArithmeticExp modulo_exp = new Sum(
                new Number(3),
                new Product(new Number(2),new Modulo(new Number(11), new Number(2)))
        );
        ArithmeticExp division_exp = new Sum(
                new Number(3),
                new Product(new Number(2),new Divison(new Number(11), new Number(2)))
        );
        System.out.println("Result of expression "+ exp.toString()+ " is : " + exp.evaluate());
        System.out.println("Result of expression "+ modulo_exp.toString()+ " is : " + modulo_exp.evaluate());
        System.out.println("Result of expression "+ division_exp.toString()+ " is : " + division_exp.evaluate());

    }
}