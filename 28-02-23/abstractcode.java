import java.util.Scanner;

abstract class student{
int rollno,regno;
abstract void course();
}

class kiitian extends student{
    void course(){
        String str="WT";
        regno=2106287;
        rollno=287;
        System.out.println("Roll No:"+rollno+"\nReg No:"+regno+"\nCourse Name:"+str);
    }
}

class abstractcode{
public static void main(String[] args) {
        student s=new kiitian();
        kiitian k=new kiitian();
        s.course();
        s=k;
        s.course();
        k.course();
    }
}

