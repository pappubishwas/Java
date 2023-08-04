import java.util.Scanner;

public class week {
    public static void main(String[] args){
        int dayNo,mod;
        System.out.println("Enter the dayNo. :- ");
        Scanner s= new Scanner(System.in);
        dayNo= s.nextInt();
        mod=dayNo%7;
        //System.out.println("Enter the dayNo. :- "+mod);
        switch(mod){
            case 0:
            System.out.println("This Friday.");
            break;
            case 1:
            System.out.println("This Saturday.");
            break;
            case 2:
            System.out.println("This Sunday.");
            break;
            case 3:
            System.out.println("This Monday.");
            break;
            case 4:
            System.out.println("This Tuesday.");
            break;
            case 5:
            System.out.println("This Wednesday.");
            break;
            case 6:
            System.out.println("This Thursday.");
            break;
        }
    }
}
