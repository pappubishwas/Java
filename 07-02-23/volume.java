import java.util.Scanner;
class box
{
    int length,width,height;
    void getdata(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of box:");
        length=s.nextInt();
        System.out.print("Enter the width of box:");
        width=s.nextInt();
        System.out.print("Enter the height of box:");
        height=s.nextInt();
    }
    void calculate_volume(){
        int vol;
        vol=length*width*height;
        System.out.print("The volume of the box is :"+vol);
    }
}
public class volume {
    public static void main(String[] args){
        box obj=new box();
        obj.getdata();
        obj.calculate_volume();

    }
}
