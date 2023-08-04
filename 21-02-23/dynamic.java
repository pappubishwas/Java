import java.util.Scanner;

class A{
    public final void print(String str) {
    System.out.println("Printing string: " + str);
   }

   public final void print(int num) {
      System.out.println("Printing number: " + num);
   }

    int x;
    void display(){
        System.out.print("In a Class A");
    }
}
class B extends A{
    int z;
    static{
        System.out.println("Enter static class B");
    }
    B(){
        System.out.println("In a Constructor B");
    }
    void display(){
        System.out.print("In class B");
    }
}
class C extends B{
    int z;
    C(){
       //super(2);
       System.out.println("In a Constructor C");
    //    z=a;
       //super.display();
    }
    void display(){
        //super.display();
        System.out.print("In class C");
    }
}

class dynamic{
    public static void main(String[] args){
        // A a11;
        A a1=new A();
        a1.print("Pappu");
        // //B b1=new B();
        // C c1=new C(8);
        // a11=c1;
        // a11.display();
        new C();
    }
}