import java.util.*;

public class q1{
    public static void main(String[] args) {
        String cities[] = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"};
        
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        
        boolean hasDuplicates = false;
        for (int i = 0; i < cities.length; i++) {
            for (int j = i + 1; j < cities.length; j++) {
                if (cities[i].equals(cities[j])) {
                    hasDuplicates = true;
                    break;
                }
            }
        }
        if (hasDuplicates) {
            System.out.println("There are duplicates in the city names.");
        } else {
            System.out.println("There are no duplicates in the city names.");
        }
        System.out.println("First characters of every city:");
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i].charAt(0)+" ");
        }
    }
}
