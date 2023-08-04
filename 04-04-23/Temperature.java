import java.util.Scanner;

public class Temperature {
    private double temperature;
    private char unit;

    public Temperature(double temperature, char unit) {
        if (unit != 'F' && unit != 'C') {
            throw new IllegalArgumentException("Invalid temperature unit: " + unit);
        }
        if (unit == 'F') {
            this.temperature = (temperature - 32) * 5 / 9;
            this.unit = 'C';
        } else {
            this.temperature = temperature * 9 / 5 + 32;
            this.unit = 'F';
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public char getUnit() {
        return unit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        String input = scanner.nextLine();

        double temperature;
        char unit;

        try {
            temperature = Double.parseDouble(input.substring(0, input.length() - 1));
            unit = input.charAt(input.length() - 1);
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid input format");
            return;
        }

        try {
            Temperature temp = new Temperature(temperature, unit);
            System.out.printf("%.2f%c is equivalent to %.2f%c\n", temperature, unit, temp.getTemperature(), temp.getUnit());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}