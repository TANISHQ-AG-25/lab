import java.util.Scanner;
class Student {
    int roll;
    String name;
    double cgpa;
    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    void display() {
        System.out.println(roll + "\t\t" + name + "\t\t" + cgpa);
    }
    static void displayLowestCGPA(Student[] students) {
        if (students.length == 0) return;
        Student lowest = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].cgpa < lowest.cgpa) {
                lowest = students[i];
            }
        }
        System.out.println("Lowest CGPA student details");
        System.out.println("Name: " + lowest.name);
        System.out.println("Roll No: " + lowest.roll);
        System.out.println("CGPA: " + lowest.cgpa);
    }
}
class Students {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] studentArray = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Roll No: ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String nm = sc.nextLine();
            System.out.print("CGPA: ");
            double c = sc.nextDouble();
            studentArray[i] = new Student(r, nm, c);
        }
        System.out.println("Roll No\t\tName\t\tCGPA");
        for (int i = 0; i < n; i++) {
            studentArray[i].display();
        }
        Student.displayLowestCGPA(studentArray);
    }
}