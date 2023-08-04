import java.util.Scanner;

class figure
{
    int r1, r2;
    figure (int a, int b)
    {
        r1 = a;
        r2 = b;
    }
    int area()
    {
        System.out.println ("Area is undefined");
        return 0;
    }
}

class rectangle extends figure
{
    rectangle (int a, int b)
    {
        super(a,b);
    }
    int area()
    {
        System.out.println ("area of rectangle:");
        return (r1*r2);
    }
}

class triangle extends figure
{
    triangle (int a, int b)
    {
        super(a,b);
    }
    int area()
    {
        System.out.println ("area of triangle:");
        return ((r1*r2)/2);
    }
}

public class compute
{
    public static void main(String[] args)
    {
        figure f11;
        figure f1 = new figure (3,4);
        triangle t1 = new triangle (4,5);
        rectangle r1 = new rectangle (5,6);
        f11 = t1;
        System.out.println(f11.area());
        //System.out.println(f1.area());
        f11=r1;
        System.out.println(f11.area());
    }
}