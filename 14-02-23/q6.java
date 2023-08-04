import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] films = new String[5];

        // Accept the names of 5 films from keyboard
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of film " + (i+1) + ": ");
            films[i] = sc.nextLine();
        }

        // Display the names starting with "k" and ending with "a"
        System.out.println("\nNames starting with 'k' and ending with 'a':");
        for (int i = 0; i < 5; i++) {
            if (films[i].startsWith("k") && films[i].endsWith("a")) {
                System.out.println(films[i]);
            }
        }

        // Display substring of all names from 1st to 3rd position
        System.out.println("\nSubstring of all names from 1st to 3rd position:");
        for (int i = 0; i < 5; i++) {
            System.out.println(films[i].substring(0, 3));
        }

        // Find last occurrence of "e" for all names
        System.out.println("\nLast occurrence of 'e' for all names:");
        for (int i = 0; i < 5; i++) {
            int lastIndex = films[i].lastIndexOf("e");
            System.out.println(films[i] + ": " + lastIndex);
        }

        sc.close();
    }
}