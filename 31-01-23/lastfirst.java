import java.util.Scanner;

public class lastfirst {
    public static void main(String args[]){
        String firstName,lastName;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your first name:");
        firstName=s.nextLine();
        System.out.println("Enter your last Name:");
        lastName=s.nextLine();
        System.out.println("Your full name is : "+firstName+" "+lastName);
    }
    
}
