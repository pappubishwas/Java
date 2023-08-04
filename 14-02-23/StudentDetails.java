import java.util.Scanner;

class student {
    int roll[];
    String name[];
    float cgpa[];
    int n;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of students : ");
        n = sc.nextInt();
        roll = new int[n];
        name = new String[n];
        cgpa = new float[n];
        System.out.println("Enter details :");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll for student-" + (i + 1) + " : ");
            roll[i] = sc.nextInt();
            System.out.print("Enter name for student-" + (i + 1) + " : ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Enter cgpa for student-" + (i + 1) + " : ");
            cgpa[i] = sc.nextFloat();
        }
    }

    void display() {
        System.out.println("S. No.\tRoll No.\tName\tCGPA");
        for (int i = 0; i < n; i++)
            System.out.println((i + 1) + "\t" + roll[i] + "\t" + name[i] + "\t" + cgpa[i]);
    }

    void lowestcgpa() {
        float min = cgpa[0];
        for (int i = 0; i < n; i++) {
            if (min >= cgpa[i])
                min = cgpa[i];
        }
        System.out.println("Student(s) with lowest cgpa :");
        for (int i = 0; i < n; i++) {
            if (cgpa[i] == min)
                System.out.println(name[i]);
        }
    }
}

public class StudentDetails {
    public static void main(String args[]) {
        student s = new student();
        s.getdata();
        s.display();
        s.lowestcgpa();

    }
}
