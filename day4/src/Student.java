import java.util.Scanner;
abstract class Student {
    int rollno;
    int regno;
    void getinput(int r, int reg) {
        rollno = r;
        regno = reg;
    }
    abstract void course();
}
class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech.");
    }
    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rollno: ");
        int r = sc.nextInt();
        System.out.print("Enter Registration no: ");
        int reg = sc.nextInt();
        Kiitian k = new Kiitian();
        k.getinput(r, reg);
        k.display();
    }
}
