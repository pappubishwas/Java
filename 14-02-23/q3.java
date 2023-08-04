import java.util.*;

public class q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] players = new String[5];
        
        for (int i = 0; i < players.length; i++) {
            System.out.print("Enter player " + (i+1) + " name: ");
            players[i] = input.nextLine();
        }
        
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].substring(2));
        }
        
        for (int i = 0; i < players.length; i++) {
            if (players[i].startsWith("s")) {
                players[i] = players[i].replace("e", "a");
            }
        }
        
        System.out.println("Modified names:");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}