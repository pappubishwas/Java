import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the reverse of the given string
        StringBuffer rev = new StringBuffer(input);//.reverse().toString();
        rev.reverse().toString();
        System.out.println("Reverse of the given string: " + rev);

        // Find a substring from the given string
        System.out.print("Enter the starting index of the substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index of the substring: ");
        int endIndex = scanner.nextInt();
        String substring = input.substring(startIndex, endIndex);
        System.out.println("Substring from the given string: " + substring);
    }
}
