
import SUMMATION.Number;

public class Demo1 {
    public static void main(String[] args) {
        Number num1 = new Number(2);
        Number num2 = new Number(3);

        if (num1.is_Even()) {
            int square = num1.getValue() * num1.getValue();
            System.out.println("Square of " + num1.getValue() + " is " + square);
        } else {
            int cube = num1.getValue() * num1.getValue() * num1.getValue();
            System.out.println("Cube of " + num1.getValue() + " is " + cube);
        }

        if (num2.is_Even()) {
            int square = num2.getValue() * num2.getValue();
            System.out.println("Square of " + num2.getValue() + " is " + square);
        } else {
            int cube = num2.getValue() * num2.getValue() * num2.getValue();
            System.out.println("Cube of " + num2.getValue() + " is " + cube);
        }
    }
}
