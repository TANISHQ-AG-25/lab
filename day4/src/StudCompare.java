import java.util.Scanner;
class StudCompare {
    int roll;
    String name;
    StudCompare(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        StudCompare s = (StudCompare) obj;
        return roll == s.roll && name.equals(s.name);
    }
}
class EqualsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of first student");
        System.out.println("Enter Roll No: ");
        int r1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String n1 = sc.nextLine();
        System.out.println("Enter details of second student");
        System.out.println("Enter Roll No: ");
        int r2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String n2 = sc.nextLine();
        StudCompare s1 = new StudCompare(r1, n1);
        StudCompare s2 = new StudCompare(r2, n2);
        if (s1.equals(s2))
            System.out.println("Both students are equal");
        else
            System.out.println("Both students are not equal");
    }
}
