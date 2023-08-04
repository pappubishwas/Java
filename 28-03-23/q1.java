package lab8;

import java.util.*;


class q1
{
    public static void main(String[] args)
    {
        int age = 11;

        try
        {
            if (age >= 18)
                System.out.println ("You are eligible to vote");
            else
                throw new Exception ("Can't eligible");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println (e);
        }
        catch (Exception e)
        {
            System.out.println ("This is catch block ");
            System.out.println (e);
        }

    }
}