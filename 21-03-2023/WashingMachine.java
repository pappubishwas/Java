//q2

interface Motor {
    int cap = 5;

    public void run();

    public void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("implementation of run & value of capacity: " + cap);
    }

    public void consume() {
        System.out.println("implementation of consume");
    }

    public static void main(String arg[]) {
        Motor obj = new WashingMachine();
        obj.run();
        obj.consume();
    }
}