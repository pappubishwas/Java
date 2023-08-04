 class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}


public class CommandLineAddition {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("At least 5 arguments are required");
            } else {
                int sum = 0;
                for (String arg : args) {
                    sum += Integer.parseInt(arg);
                }
                System.out.println("Sum of all arguments: " + sum);
            }
        } catch (CheckArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid argument - " + e.getMessage());
        }
    }
}
