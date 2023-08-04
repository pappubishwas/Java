import java.util.Scanner;
class overload{
    int a;
    double r;
    void area(double p){
        r=3.1416*p*p;
        System.out.print("The area of circle is : "+r);
    }
    void area(double p,double q){
        r=0.5*p*q;
        System.out.print("The area of Triangle is : "+r);
    }
    void area(int p){
        a=p*p;
        System.out.print("The area of Square is : "+a);
    }
}
public class function_overloading {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        overload obj=new overload();
        System.out.print("1.Area of circle.\n2.Area of triangle\n3.Area of square.\n");
        System.out.print("Enter your choice:");
        int ch=s.nextInt();
        switch(ch){
            case 1:
            {
                System.out.print("Enter the radius of circle:");
                double r=s.nextDouble();
                obj.area(r);
                break;
            }
            case 2:
            {
                System.out.print("Enter the length and width of triangle:");
                double p=s.nextInt();
                double q=s.nextInt();
                obj.area(p,q);
                break;
            }
            case 3:
            {
                System.out.print("Enter the length/width of square:");
                int p=s.nextInt();
            
                obj.area(p);
                break;
            }
        }

    }
}
