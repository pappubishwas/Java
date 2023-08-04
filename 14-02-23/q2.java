import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        String[] friends = new String[6];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 6; i++) {
            System.out.print("Enter name of friend " + (i+1) + ": ");
            friends[i] = scanner.nextLine();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(friends[i] + " ");
            System.out.print("Enter surname of " + friends[i] + ": ");
            String surname = scanner.nextLine();
            friends[i] += " " + surname;
        }

        for (int i = 0; i < 6; i++) {
            String[] nameParts = friends[i].split(" ");
            String reversedName = "";
            for (int j = nameParts.length - 1; j >= 0; j--) {
                reversedName += nameParts[j] + " ";
            }
            System.out.println(reversedName.trim());
        }
    }
}