import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Check if string is palindrome
        boolean isPalindrome = true;
        int length = inputString.length();
        for (int i = 0; i < length/2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
        
        // Arrange all alphabets of the string in descending order
        char[] charArray = inputString.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        String descendingString = new StringBuilder(sortedString).reverse().toString();
        System.out.println("Alphabets arranged in descending order: " + descendingString);
    }
}
