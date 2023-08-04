
import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        int mark;
        System.out.println("Enter your mark: ");
        Scanner s=new Scanner(System.in);
        mark=s.nextInt();
        System.out.println("The mark is :"+mark);
        if(mark>100) System.out.println("The entered mark is invalid.");
        else if(mark>=90) System.out.println("The grade is O.");
        else if(mark>=80) System.out.println("The grade is E.");
        else if(mark>=70) System.out.println("The grade is A.");
        else if(mark>=60) System.out.println("The grade is B.");
        else if(mark>=50) System.out.println("The grade is C.");
        else if(mark>=40) System.out.println("The grade is D.");
        else System.out.println("You are fail.");
    }
}


