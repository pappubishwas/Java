import java.util.Scanner;
class area
{
    int length,width,area,perimeter;
    void getdata(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of Rectangle:");
        length=s.nextInt();
        System.out.print("Enter the width of Rectangle:");
        width=s.nextInt();

    }
    void calculate(){
        area=length*width;
        perimeter=2*(length+width);
    }
    void display(){
        System.out.println("The area of the rectangle is :"+area);
        System.out.print("The perimeter of the rectangle is :"+perimeter);
    }
}
public class member_functioin {
    public static void main(String[] args){
        area obj=new area();
        obj.getdata();
        obj.calculate();
        obj.display();

    }
}

