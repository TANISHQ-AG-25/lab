import java.util.Scanner;
class details{
    String name, branch;
    int roll, sec;
    details(String name,int roll, int sec,String branch)
    {
        this.name=name;
        this.roll=roll;
        this.sec=sec;
        this.branch=branch;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + sec);
        System.out.println("Branch : "+ branch);
    }
}
class Student {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Section: ");
        int sec = sc.nextInt();

        details stu = new details(name,roll,sec,branch);
        stu.display();

    }
}