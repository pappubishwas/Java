package lab8;
import java.util.*;

public class q2
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] array = new int[3];
            array[3] = 10;
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught exception: " + e);
        }
    }
}