//q3

import java.util.*;
//import java.lang.*;

interface Salary {
    double earnings();

    double deductions();

    double bonus();
}

abstract class Manager implements Salary {
    public int basic;

    public Manager(int basic) {
        this.basic = basic;
    }

    public double earnings() {
        return this.basic + 0.8 * this.basic + 0.15 * this.basic;
    }

    public double deductions() {
        return 0.12 * this.basic;
    }
}

class company extends Manager {
    public company(int basic) {
        super(basic);
    }

    public double bonus() {
        return 0.5 * this.basic;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter basic salary : ");
        company s = new company(in.nextInt());
        System.out.println("Earnings : " + s.earnings());
        System.out.println("Deductions : " + s.deductions());
        System.out.println("Bonus : " + s.bonus());
        in.close();
    }
}