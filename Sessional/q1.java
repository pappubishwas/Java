import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
    

        String[] words = inputString.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            word=word.toLowerCase();
            int sum = 0;
            for (int i = 0; i < word.length() / 2; i++) {
                sum += Math.abs(word.charAt(i) - word.charAt(word.length() - 1 - i));
            }
            if (word.length() % 2 != 0) {
                sum += Math.abs(word.charAt(word.length() / 2) - 'a' + 1);
            }
            result.append(sum);
        }
        System.out.println("Result: " + result.toString());
    }
}