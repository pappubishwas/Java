import java.util.Scanner;
class Number{
    int a[];
    int n;
    void read(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value how many integers :");
        n=s.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

    }
    void display(){
        System.out.println("The "+n+" intgers are : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    void swap(){
        int b,s,i,k;
        b=0;s=0;
        for(i=1;i<n;i++){
            if(a[b]<a[i])b=i;
            if(a[s]>a[i])s=i;
        }
        k=a[b];
        a[b]=a[s];
        a[s]=k;
        System.out.print("\nAfter swapping ");
        display();
    }
}
public class swap {
    public static void main(String[] args){
        Number p=new Number();
        p.read();
        p.display();
        p.swap();
    }
}
