import java.util.*;

public class Subtract {
  
    public int subtract(int x, int y) 
    { 
        return (x - y); 
    }
  
    public int subtract(int x, int y, int z)
    {
        return (x - y - z);
    }
    
    public double subtract(double x, double y)
    {
        return (x - y);
    }

    public static void main(String args[])
    {
        Subtract s = new Subtract();
        System.out.println(s.subtract(10, 20));
        System.out.println(s.subtract(10, 20, 30));
        System.out.println(s.subtract(10.5, 20.5));
    }
}