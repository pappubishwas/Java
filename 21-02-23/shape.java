import java.util.Scanner;

class sh
{
    double area;
    void showArea(double p)
    {
        System.out.println ("Area : "+p);
        
    }
}

class rectangle extends sh
{
    double claculateRec(double a,double b)
    {
        area=a*b;
        return (area);
    }
}

class circle extends sh
{

    double claculateCir(double a)
    {
        area=(3.1416*a*a);
        return (area);
    }
}


public class shape {
    public static void main(String[] args) {
        circle c=new circle();
        rectangle r=new rectangle();
        c.claculateCir(2);
        r.claculateRec(3, 4);
    }
}
