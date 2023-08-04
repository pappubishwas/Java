import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = new String[5];

        // Accept names of five subjects from keyboard
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of subject " + (i+1) + ": ");
            subjects[i] = sc.nextLine();
        }

        // Display "Programming subjects" and convert to lower case
        System.out.println("\nProgramming subjects:");
        for (int i = 0; i < 5; i++) {
            if (subjects[i].contains("Programming")) {
                System.out.println(subjects[i].toLowerCase().trim());
            }
        }

        // Reverse the contents of all subjects
        System.out.println("\nAfter reversing the contents of all subjects:");
        for (int i = 0; i < 5; i++) {
            String reversed = new StringBuilder(subjects[i]).reverse().toString();
            System.out.println(reversed);
        }

        sc.close();
    }
}