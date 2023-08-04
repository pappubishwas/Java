import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        
        if (isValidPassword(password)){
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }
    
    public static boolean isValidPassword(String password) {
        // check if password has at least six characters
        if (password.length() < 6) {
            return false;
        }
        
        // check if password consists of only uppercase letters and digits
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isUpperCase(c) && !Character.isDigit(c)) {
                return false;
            }
        }
        
        // check if password contains at least three digits
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 3) {
            return false;
        }
        
        return true;
    }
}
