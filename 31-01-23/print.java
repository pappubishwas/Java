import java.util.Scanner;

public class print {
    public static void main(String[] args){
        String name,branch,section;
        int roll;
        System.out.println("Enter your name: ");
        Scanner s= new Scanner(System.in);
        name=s.nextLine();
        // System.out.println("Enter your roll: ");
        // roll=s.nextInt();
        System.out.println("Enter your Section: ");
        section=s.nextLine();
        System.out.println("Enter your Branch: ");
        branch=s.nextLine();
        System.out.println("Enter your roll: ");
        roll=s.nextInt();

        System.out.println("My name is: "+name);
        System.out.println("My Roll No:"+roll);
        System.out.println("My Section:"+section);
        System.out.println("My Branch:"+branch);
    }
}
