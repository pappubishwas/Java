import java.util.Scanner;

public class TryandCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, result;

        try {
            System.out.print("Enter a: ");
            a = scanner.nextInt();
            System.out.print("Enter b: ");
            b = scanner.nextInt();

            result = a / b;
            System.out.println("Division: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        scanner.close();
    }
}