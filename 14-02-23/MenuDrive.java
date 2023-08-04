import java.util.Scanner;
class area{
    double r;
    void circleArea(double p){
        r=3.1416*p*p;
        System.out.print("The area of circle is : "+r);
    }
    void triangleArea(double p,double q){
        r=0.5*p*q;
        System.out.print("The area of Triangle is : "+r);
    }
    void SquareArea(double p){
        r=p*p;
        System.out.print("The area of Square is : "+r);
    }
}
public class MenuDrive {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        area obj=new area();
        System.out.print("1.Area of circle.\n2.Area of triangle\n3.Area of square.\n");
        System.out.print("Enter your choice:");
        int ch=s.nextInt();
        switch(ch){
            case 1:
            {
                System.out.print("Enter the radius of circle:");
                double r=s.nextDouble();
                obj.circleArea(r);
                break;
            }
            case 2:
            {
                System.out.print("Enter the length and width of triangle:");
                double p=s.nextDouble();
                double q=s.nextDouble();
                obj.triangleArea(p, q);
                break;
            }
            case 3:
            {
                System.out.print("Enter the edge length of square:");
                double p=s.nextDouble();
            
                obj.SquareArea(p);
                break;
            }
        }

    }
}
