import java.util.*;

public class q4 {
    public static void main(String[] args) {
        String[] sports = new String[7];
        Scanner scanner = new Scanner(System.in);

        // Accept names of seven sports as input
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter name of sport " + (i+1) + ": ");
            sports[i] = scanner.nextLine();
        }

        // Display names starting with "t"
        System.out.println("\nNames starting with 't':");
        for (int i = 0; i < sports.length; i++) {
            if (sports[i].toLowerCase().startsWith("t")) {
                System.out.println(sports[i]);
            }
        }

        // Display names ending with "t"
        System.out.println("\nNames ending with 't':");
        for (int i = 0; i < sports.length; i++) {
            if (sports[i].toLowerCase().endsWith("t")) {
                System.out.println(sports[i]);
            }
        }

        // Insert character "m" at position 3
        for (int i = 0; i < sports.length; i++) {
            sports[i] = sports[i].substring(0, 3) + "m" + sports[i].substring(3);
        }

        // Display the modified names
        System.out.println("\nNames after inserting 'm' at position 3:");
        for (int i = 0; i < sports.length; i++) {
            System.out.println(sports[i]);
        }
    }
}