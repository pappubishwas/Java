import java.util.*;

abstract class Student{
    String s;
    Double cia,end,med;
    Integer roll,semno;
    abstract void mark();
}

class CIA extends Student{
    void get_studentInfo(){
        Scanner p=new Scanner(System.in);
        System.out.print("Enter your name:");
        s=p.nextLine();
        System.out.print("Enter your roll:");
        roll=p.nextInt();
        System.out.print("Enter your semno:");
        semno=p.nextInt();
    }
    void mark(){
        Scanner p=new Scanner(System.in);
        System.out.print("Enter your CIA mark::");
        cia=p.nextDouble();
    }
}

class semester extends Student{
    void mark(){
        Scanner p=new Scanner(System.in);
        System.out.print("Enter your med semester mark::");
        med=p.nextDouble();
        System.out.print("Enter your end semester mark::");
        end=p.nextDouble();
    }
}

class q2{
    public static void main(String[] args){
        semester s=new semester();
        CIA c=new CIA();
        s.get_studentInfo();
        c.mark();
        s.mark();
    }
}