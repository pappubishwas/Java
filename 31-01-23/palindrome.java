import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        int num,p,r=0,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        i=num;
        while(num>0){
            p=num%10;
            r=r*10+p;
            num=num/10;
        }
        if(r==i) System.out.println("The number is palindrome.");
        else System.out.println("The number is not palindrome.");
    }
}
