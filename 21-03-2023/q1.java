//q1

import java.util.*;

abstract class Student {
    private int roll;
    private int regNum;

    public Student() {
        this.roll = 0;
        this.regNum = 0;
    }

    public Student(int roll, int regNum) {
        this.roll = roll;
        this.regNum = regNum;
    }

    abstract void course();
}

class KIITian extends Student {
    private String courseName;

    public KIITian(int roll, int regNum, String courseName) {
        super(roll, regNum);
        this.courseName = courseName;
    }

    public void course() {
        System.out.println("Course : " + courseName);
    }
}

public class q1{
    public static void main(String[] args) {
        KIITian k = new KIITian(1, 10001, "CSE");
        Student s = k;
        s.course();
    }
}





