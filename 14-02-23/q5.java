import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        String[] actors = {"Tom Cruise", "Brad Pitt", "Leonardo DiCaprio", "Robert De Niro", "Al Pacino"};

        // Sort the names in descending order
        Arrays.sort(actors, (a, b) -> b.compareTo(a));

        // Display the sorted names
        System.out.println("Sorted names in descending order:");
        for (int i = 0; i < actors.length; i++) {
            System.out.println((i+1) + ". " + actors[i]);
        }

        // Calculate the average length of names
        int totalLength = 0;
        for (int i = 0; i < actors.length; i++) {
            totalLength += actors[i].length();
        }
        double avgLength = (double) totalLength / actors.length;

        // Append "*" at the end of all names
        for (int i = 0; i < actors.length; i++) {
            actors[i] += "*";
        }

        // Display the names with "*" appended at the end
        System.out.println("\nNames with '*' appended at the end:");
        for (int i = 0; i < actors.length; i++) {
            System.out.println("01" + (i+1) + ". " + actors[i]);
        }

        // Display the average length of names
        System.out.println("\nAverage length of names: " + avgLength);
    }
}