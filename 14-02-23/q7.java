import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] states = new String[6];

        // Accept names of six states from keyboard
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter name of state " + (i+1) + ": ");
            states[i] = sc.nextLine();
        }

        // Change first letter to "n" if it is "m"
        System.out.println("\nAfter changing first letter to 'n' if it is 'm':");
        for (int i = 0; i < 6; i++) {
            if (states[i].startsWith("m")) {
                states[i] = "n" + states[i].substring(1);
            }
            System.out.println(states[i]);
        }

        // Append "state" to the end of all names
        System.out.println("\nAfter appending 'state' to the end of all names:");
        for (int i = 0; i < 6; i++) {
            states[i] += " state";
            System.out.println(states[i]);
        }

        // Insert "India" from 4th position for all the names
        System.out.println("\nAfter inserting 'India' from 4th position for all names:");
        for (int i = 0; i < 6; i++) {
            states[i] = states[i].substring(0, 3) + "India" + states[i].substring(3);
            System.out.println(states[i]);
        }

        sc.close();
    }
}