import java.util.Scanner;
public class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new NumberFormatException("Invalid side value. Sides must be positive numbers.");
        }
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length;
        try {
            length = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for length");
            return;
        }

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth;
        try {
            breadth = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for breadth");
            return;
        }

        Area rectangle = new Area(length, breadth);
        System.out.printf("The area of the rectangle with length %.2f and breadth %.2f is %.2f\n", length, breadth, rectangle.getArea());
    }

}