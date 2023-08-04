package lab8;
import java.util.*;

public class q3 {
    public static void main(String[] args){

        int num1=24,num2=27;
        try {
            if ((num1-num2)>=0)
            System.out.println("Difference of two number is "+(num1-num2));
            else
                throw new Exception("Subtraction is negative");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }

}
