interface Motor {
    int capacity = 100;
    void run();
    void consume();

}  
      
class WashingMachine implements Motor {
    public void run() {
        System.out.println("Implementation of Run method");
    }

    public void consume() {
        System.out.println("Implementation of Consume method");
    } 
}

      
class q2{  
    public static void main(String args[]) {
        WashingMachine s = new WashingMachine();  
        s.run();
        s.consume();
    }
}