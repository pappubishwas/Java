import java.util.Scanner;


class A{
    int a;
    A(){
        System.out.println("This is the Constructor A");
    }
    A(int p){
        a=p;
        System.out.println("This is perameterized constructor in A");
    }
}
class B extends A{
        B(int a){
            super(a);
            System.out.println("This is the constructor B");
        }
    }

public class practice {
        public static void main(String[] args){
            B b1=new B(10);
        }    
}
