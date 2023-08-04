import java.util.*;

class TwoD {
    double length, breadth;

    TwoD(double a, double b) {
        this.length = a;
        this.breadth = b;
    }

    void calculateSqPrice() {
        System.out.println("Rs. " + 40 * length * breadth);
    }
}

class ThreeD extends TwoD {
    double height;

    ThreeD(double a, double b, double c) {
        super(a, b);
        this.height = c;
    }

    void calculateCuPrice() {
        System.out.println("Rs. " + 60 * length * breadth * height);
    }
}

class Plastic_cost {
    public static void main(String[] args) {
        ThreeD threeD = new ThreeD(1, 2, 3);
        threeD.calculateCuPrice();
        threeD.calculateSqPrice();
    }
}